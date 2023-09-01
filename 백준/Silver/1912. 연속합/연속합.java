import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Integer[] dp;

    static Integer[] arr;
    static StringTokenizer st;
    static StringBuilder sb;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 1];
        arr = new Integer[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[1] = arr[1];
        max = dp[1];
        dp(n);
//        Arrays.stream(dp).forEach((Integer i) -> System.out.println("i = " + i));
        System.out.println(max);
    }

    static int dp(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(arr[n], dp(n - 1) + arr[n]);
            max = Math.max(dp[n], max);
        }
        return dp[n];
    }
}

