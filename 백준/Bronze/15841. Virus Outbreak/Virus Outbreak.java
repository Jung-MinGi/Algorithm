import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static BigInteger[] dp = new BigInteger[491];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=3; i<dp.length; i++){
            dp[i]=BigInteger.ZERO;
        }
        dp[1]= BigInteger.ONE;
        int a;
        dp[2]= BigInteger.ONE;
        while( (a = Integer.parseInt(br.readLine())) != -1){

            BigInteger y = recur(a);
            System.out.println("Hour "+a+": "+y+" cow(s) affected");
        }

    }
    static BigInteger recur(int a){
        if((dp[a].compareTo(BigInteger.ZERO))==0){
            dp[a] = recur(a-1).add(recur(a-2));
        }
        return dp[a];
    }
}