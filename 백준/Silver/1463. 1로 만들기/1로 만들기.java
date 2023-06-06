import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    static int[] dp = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[1]=0;
            dp[2]=1;
            dp[3]=1;
            dp[4]=2;
            dp[5]=3;
        System.out.println(recur(n));
    }
    static int recur(int a){
        if(dp[a]==0 && a!=1){
            if(a%2==0 && a%3==0){
                dp[a] = Math.min(recur(a/2),Math.min(recur(a/3),recur(a-1)))+1;
            }
            else if(a%2==0){
                dp[a] = Math.min(recur(a/2),recur(a-1))+1;
            }
            else if(a%3==0){
                dp[a] = Math.min(recur(a/3),recur(a-1))+1;
            }else{
                dp[a] = recur(a-1)+1;
            }
        }
        return dp[a];
    }
}