import java.util.Scanner;

public class Main {
    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();

        int m = scanner.nextInt();
        while (m-- > 0) {
            int k = scanner.nextInt();
            int l = scanner.nextInt() - 1;
            int r = scanner.nextInt() - 1;
            if (k == 1) {
                for (int j = l; j <= r; j++) {
                    a[j] = (a[j] * a[j]) % 2010;
                }
            } else {
                int sum = 0;
                for (int j = l; j <= r; j++) {
                    sum += a[j];
                }
                System.out.println(sum);
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        solve();
    }
}
