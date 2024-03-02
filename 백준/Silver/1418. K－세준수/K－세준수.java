import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] prime = new boolean[100001];
    static int cnt = 0;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        int count=0;
        for (int i = 1; i <= n; i++) {
            if(kNumber(i))count++;
        }
        System.out.println(count);

    }

    static boolean kNumber(int a) {
        int max = 0;
        for (int i = 2; i < a; i++) {
            if (prime[i]) continue;
            while (a % i == 0) {
                a = a / i;
                max = Math.max(i, max);
            }
        }
        max = Math.max(a, max);
        return max <= m;
    }
}


