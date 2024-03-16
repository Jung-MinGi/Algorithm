import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int min = 0;
        for (int i = 1; i < n; i++) {
            int tmp = arr[i] - arr[i - 1];
            min = gcd(tmp, min);
        }

        System.out.println(((arr[arr.length - 1] - arr[0] - 1) / min) - (n - 2));
    }

    static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}