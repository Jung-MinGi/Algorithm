import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static final int val = 9901;
    static int[][] dp = new int[100001][3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[1][0] = 1;
        dp[1][1] = 1;
        dp[1][2] = 1;
        dp(n, 0);
        dp(n, 1);
        dp(n, 2);
        long sum = 0;
        for (Integer i : dp[n]) {
            sum += i;
        }
        System.out.println(sum%val);
    }


    static int dp(int x, int y) {
        if (dp[x][y] == 0) {
            if (y == 0) {
                dp[x][y] = ((dp(x - 1, 0) % val) + (dp(x - 1, 1) % val) + (dp(x - 1, 2) % val)) % val;
            } else if (y == 1) {
                dp[x][y] = ((dp(x - 1, 0) % val) + (dp(x - 1, 2) % val)) % val;
            } else {
                dp[x][y] = ((dp(x - 1, 0) % val) + (dp(x - 1, 1) % val)) % val;
            }
        }
        return dp[x][y];
    }
}

