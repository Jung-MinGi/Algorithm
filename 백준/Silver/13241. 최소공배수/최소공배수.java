import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());
        long a = (n * m) / gcd(n, m);
        System.out.println(a);
    }

    static long gcd(long a, long b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
