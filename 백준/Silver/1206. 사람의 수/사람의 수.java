import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] averages = new int[N];
        for (int i = 0; i < N; i++) {
            String input = scanner.next();
            input = input.replace(".", "");
            int average = Integer.parseInt(input);
            averages[i] = average;
        }

        for (int i = 1; i <= 1000; i++) {
            boolean check = true;
            for (int j = 0; j < N; j++) {
                int possibleMinAverage = averages[j] * i;
                int originTotal;
                if (possibleMinAverage % 1000 != 0) {
                    originTotal = (possibleMinAverage / 1000 + 1) * 1000;
                } else {
                    originTotal = possibleMinAverage;
                }

                if (originTotal / i != averages[j]) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(i);
                break;
            }
        }

        scanner.close();
    }
}
