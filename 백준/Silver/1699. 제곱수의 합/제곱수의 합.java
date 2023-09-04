import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static Integer[] dp = new Integer[100001];

    static int[] arr;
    static StringTokenizer st;
    static StringBuilder sb;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 100000; i >= 1; i--) {
            if (dp[i] == null) {
                dp(i);
            }
        }
        System.out.println(dp[n]);
//        System.out.println(soultionUpperBound(753,753));
    }

    static int soultionUpperBound(int target, int idx) {
        int low = 0;
        int high = idx;
        while (low < high) {
            int mid = (low + high) / 2;
            int pow = (int) Math.pow(mid, 2);
            if (target < pow) {
                high = mid;
            } else {
                low = mid + 1;

            }
        }
        return high;
    }


    static int dp(int n) {
        if (dp[n] == null) {
            int high = soultionUpperBound(n, n);//4
            int min = Integer.MAX_VALUE;
            for (int i=1; i<high; i++) {
                int pow = (int) Math.pow(i, 2);
                if (n == pow) {
                    dp[n] = 1;
                    break;
                } else {
                    min= Math.min(min,dp(n - pow));
                    dp[n]=min;
                }
            }
        }
        return dp[n]+1;
    }
}

