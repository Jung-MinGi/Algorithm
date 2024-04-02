import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextDouble()) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            double x3 = scanner.nextDouble();
            double y3 = scanner.nextDouble();
            double x4 = scanner.nextDouble();
            double y4 = scanner.nextDouble();

            double x = (x1 == x3 ? x2 + x4 - x1 : (x1 == x4 ? x2 + x3 - x1 : (x2 == x3 ? x1 + x4 - x2 : x1 + x3 - x2)));
            double y = (y1 == y3 ? y2 + y4 - y1 : (y1 == y4 ? y2 + y3 - y1 : (y2 == y3 ? y1 + y4 - y2 : y1 + y3 - y2)));

            System.out.printf("%.3f %.3f\n", x, y);
        }

        scanner.close();
    }
}
