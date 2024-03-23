import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class Main {
    static BigInteger count = new BigInteger("0");
    static int a = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        a = Integer.parseInt(br.readLine());
        if (a <= 20) {

            recursive(a, 1, 2, 3, sb);
            System.out.println(count);
            System.out.println(sb);
        } else {
            System.out.println(new BigInteger("2").pow(a).subtract(new BigInteger("1")));
        }
    }

    static void recursive(int n, int from, int tmp, int to, StringBuilder sb) {
        if (n == 1) {
            count = count.add(new BigInteger("1"));
            sb.append(from).append(" ").append(to).append('\n');
        } else {
            recursive(n - 1, from, to, tmp, sb);
            count = count.add(new BigInteger("1"));
            sb.append(from).append(" ").append(to).append('\n');
            recursive(n - 1, tmp, from, to, sb);
        }
    }

}
