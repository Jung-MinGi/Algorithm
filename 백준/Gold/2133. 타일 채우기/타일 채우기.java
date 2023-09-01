import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] dp = new int[31];

    static Integer[] arr;
    static StringTokenizer st;
    static StringBuilder sb;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[0] = 1;
        dp[2] = 3;
        dp(30);
            System.out.println(dp[n]);
        
    }
    static int dp(int n) {
        if (n % 2 == 1) {
            dp[n] = 0;
            return dp[n];
        }
        if (dp[n] == 0 && n % 2 == 0) {
            dp[n] = dp(n - 2) * 3 + 2;
            for (int i = 4; i < n; i++) {
                dp[n] += dp(n - i) * 2;
            }
        }
        return dp[n];
    }
}

