import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    static BigInteger max = new BigInteger(100000000000000L+ "");
    static boolean[] prime = new boolean[10000001];
    static int cnt = 0;
    static long a, b = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) prime[j] = true;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        for (int i = 2; i < prime.length; i++) {
            if (prime[i]) continue;
            if (i > b) break;
            for (int j = 2; j <= 47; j++) {
                long pow = pow((long) i, j);
                BigInteger m = new BigInteger(pow + "").multiply(new BigInteger(i + ""));
                int tmp =m.compareTo(max);

                if (pow < a) continue;
                if (pow >= b) {
                    if (pow == b) cnt++;
                    break;
                }
                cnt++;
                if (tmp > 0) {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }


    static long pow(long x, long n) {
        if (n == 0) return 1;
        long ret = pow(x, n / 2);
        if (n % 2 == 0) return ret * ret;
        else return ret * ret * x;
    }
}


