import javax.management.InstanceNotFoundException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.StringTokenizer;

public class Main {
    static Long[] dp = new Long[91];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        dp[1] = 1L;
        dp[0] = 0L;
        int n = Integer.parseInt(br.readLine());
        System.out.println(dp(n));


    }

    static Long dp(int n) {
        if(dp[n]==null){
            dp[n] = dp(n - 1) + dp(n - 2);
        }
        return dp[n];
    }
}
