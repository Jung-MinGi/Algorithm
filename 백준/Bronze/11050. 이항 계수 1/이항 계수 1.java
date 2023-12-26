import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp = new int[11][11];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(pascal(a,b));
    }

    static int pascal(int n, int r) {

        if (r == 0 || n == r) {
            return dp[n][r] = 1;
        }
        if (dp[n][r] > 0) return dp[n][r];
        return dp[n][r] = pascal(n - 1, r - 1) + pascal(n - 1, r);
    }
}
