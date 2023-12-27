import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int MOD = 10007;
    private static int[][] dp = new int[1001][1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        dp[1][1] = 1;
        dp[1][0] = 1;
        System.out.println(soultion(a, b));
    }

    static int soultion(int n, int k) {
        if (n == k || k == 0) return dp[n][k]=1;
        if (dp[n][k] > 0) return dp[n][k];
        return dp[n][k] = (soultion(n - 1, k - 1) + soultion(n - 1, k)) % MOD;
    }
}
