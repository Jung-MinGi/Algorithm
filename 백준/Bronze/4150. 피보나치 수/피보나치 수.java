import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger pre1 = new BigInteger("0");
        BigInteger pre2 = new BigInteger("1");
        BigInteger sum = new BigInteger("1");
        int a = Integer.parseInt(br.readLine());
        for (int i = 1; i < a; i++) {
            sum = (pre1.add(pre2));
            pre1 = pre2;
            pre2 = sum;
        }
        System.out.println(sum);
    }
}
