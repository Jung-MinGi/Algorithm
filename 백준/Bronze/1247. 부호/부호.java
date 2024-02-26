import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = 3;
        while(n-->0){
            int m = Integer.parseInt(br.readLine());
            BigInteger result = new BigInteger("0");
            while(m-->0){
                BigInteger bigInteger = new BigInteger(br.readLine());
                result = result.add(bigInteger);
            }
            if(result.compareTo(new BigInteger("0"))<0){
                System.out.println("-");
            }else if(result.compareTo(new BigInteger("0"))==0){
                System.out.println(0);
            }else System.out.println("+");
        }
    }
}