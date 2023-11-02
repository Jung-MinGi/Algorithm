import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static int[] arr;
    static int[] dp;
    static int[] reverseDp;
    static int answer = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new int[n];
        reverseDp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = 1;
        reverseDp[n-1] = 1;
        for (int i = 1; i < n; i++) {
            dp(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            reverseDp(i);
        }

        for (int i = 0; i < n; i++) {
//            if (dp[i] == 1 || reverseDp[i] == 1) {
//                answer = Math.max(dp[i] + reverseDp[i], answer);
//                continue;
//            }
            answer = Math.max(dp[i] + reverseDp[i] - 1, answer);
        }
        System.out.println(answer);
    }

    static int reverseDp(int idx) {
        if (reverseDp[idx] == 0) {
            for (int i = idx + 1; i < n; i++) {
                if (arr[idx] > arr[i]) {
                    reverseDp[idx] = Math.max(reverseDp(i), reverseDp[idx]);
                }
            }
            reverseDp[idx]++;
        }
        return reverseDp[idx];
    }

    static int dp(int idx) {
        if (dp[idx] == 0) {
            for (int i = idx - 1; i >= 0; i--) {
                if (arr[idx] > arr[i]) {
                    dp[idx] = Math.max(dp(i), dp[idx]);
                }
            }
            dp[idx]++;
        }
        return dp[idx];
    }
}