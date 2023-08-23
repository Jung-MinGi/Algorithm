import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[] dp = new long[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[0] = 1;
        while(n-->0){
            int a = Integer.parseInt(br.readLine());
            System.out.println(dp(a));
        }

    }

    static long dp(int a) {
        if (dp[a] == 0) {
            if (a >= 3) {
                dp[a]=(dp(a-3)%1000000009+dp(a-2)%1000000009+dp(a-1)%1000000009)%1000000009;
            } else if (a >= 2) {
                dp[a]=(dp(a-2)%1000000009+dp(a-1)%1000000009)%1000000009;
            }
        }
        return dp[a];
    }
}
