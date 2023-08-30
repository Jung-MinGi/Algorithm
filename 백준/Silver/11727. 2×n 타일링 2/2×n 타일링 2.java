import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr = new int[1001];
    static int[] dp = new int[1001];
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[1]=1;
        dp[2]=3;
        dp(1000);
        System.out.println(dp[n]%10007);
    }
    static int dp(int n){
        if(dp[n]==0){
            dp[n]=((dp(n-1)%10007)+(dp(n-2)*2)%10007);
        }return dp[n];
    }
}

