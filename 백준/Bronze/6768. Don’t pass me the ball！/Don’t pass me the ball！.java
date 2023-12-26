import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] dp = new int[100][100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        if(a<4){
            System.out.println(0);
            return;
        }
        dp(a-1,3);
        System.out.println(dp[a-1][3]);
    }

    static int dp(int n, int r) {
        if (n == r || r == 0) return dp[n][r] = 1;

        if(dp[n][r]>0)return dp[n][r];

        return dp[n][r]=dp(n-1,r-1)+dp(n-1,r);
    }
}
