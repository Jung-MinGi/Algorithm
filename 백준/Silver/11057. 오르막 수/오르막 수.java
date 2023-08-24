import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[][] dp = new int[1001][10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Arrays.fill(dp[1], 1);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            dp(1000, i);
        }
        for (int i : dp[n]) {
            sum+=i;
        }
        System.out.println(sum%10007);
    }

    static int dp(int x, int y) {
        if (dp[x][y] == 0) {
            for (int i = y; i < 10; i++) {
                dp[x][y] = ((dp[x][y] % 10007) + (dp(x - 1, i) % 10007)) % 10007;
            }
        }
        return dp[x][y];
    }
}
