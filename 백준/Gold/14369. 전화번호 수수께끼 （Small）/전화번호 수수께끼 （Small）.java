import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int t = 1; t <= T; t++) {
            String S = scanner.nextLine();
            String phoneNumber = getPhoneNumber(S);
            System.out.println("Case #" + t + ": " + phoneNumber);
        }
        scanner.close();
    }

    public static String getPhoneNumber(String S) {
        int[] count = new int[10]; // Count of each digit
        count[0] = countChar(S, 'Z');
        count[2] = countChar(S, 'W');
        count[4] = countChar(S, 'U');
        count[6] = countChar(S, 'X');
        count[8] = countChar(S, 'G');
        count[1] = countChar(S, 'O') - count[0] - count[2] - count[4];
        count[3] = countChar(S, 'H') - count[8];
        count[5] = countChar(S, 'F') - count[4];
        count[7] = countChar(S, 'S') - count[6];
        count[9] = countChar(S, 'I') - count[5] - count[6] - count[8];
        
        StringBuilder phoneNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < count[i]; j++) {
                phoneNumber.append(i);
            }
        }
        return phoneNumber.toString();
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}