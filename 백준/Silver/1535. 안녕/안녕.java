import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n + 1][100];
        int[] health = new int[n + 1];
        int[] happy = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            health[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            happy[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < 100; j++) {
                if (health[i] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i-1][j-health[i]] + happy[i]);
                } else dp[i][j] = dp[i - 1][j];
            }
        }
        System.out.println(dp[n][99]);
    }

}
