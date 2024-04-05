import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            br.readLine();
            BigInteger tmp = new BigInteger("0");
            BigInteger a = new BigInteger(br.readLine());
            for (int i = 0; new BigInteger(i+"").compareTo(a)<0; i++) {
              tmp= tmp.add(new BigInteger(br.readLine()));
            }
            System.out.println((tmp.remainder(a).compareTo(new BigInteger("0"))==0 ? "YES" : "NO"));

        }
    }

}

