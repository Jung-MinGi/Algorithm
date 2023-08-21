import javax.management.InstanceNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        dp = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<arr.length; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = arr[1];
        System.out.println(dp(n));

    }

    static int dp(int n) {
        if (dp[n] == Integer.MAX_VALUE) {
            for (int i = 1; i <= n; i++) {
                dp[n] = Math.min(dp[n], dp(n - i) + arr[i]);
            }
        }
        return dp[n];
    }
}
