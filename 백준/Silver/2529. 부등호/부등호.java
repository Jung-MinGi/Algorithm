import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static String[] arr;
    static int[] dp;
    static int n;
    static ArrayList<StringBuilder> list = new ArrayList<>();
    static int min = Integer.MAX_VALUE;
    static boolean[] visit;
    static StringTokenizer st;
    static StringBuilder sb;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        visit = new boolean[10];
        arr = new String[n];
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < n; j++) {
            arr[j] = st.nextToken();
        }
        for (int i = 0; i < 10; i++) {
            visit[i] = true;
            dp[0] = i;
            backTracking(1);
            visit[i] = false;
        }
        System.out.println(list.stream().max((a,b)->a.compareTo(b)).get());
        System.out.println(list.stream().max((a,b)->b.compareTo(a)).get());
    }

    static void backTracking(int depth) {
        if (depth == n + 1) {
            sb = new StringBuilder();
            for (int i : dp) {
                sb.append(i);
            }
          list.add(sb);
            return;
        }
        String s = arr[depth - 1];
        if (s.equals(">")) {
            for (int i = 0; i < dp[depth - 1]; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    dp[depth] = i;
                    backTracking(depth + 1);
                    visit[i] = false;
                }
            }
        } else {
            for (int i = dp[depth - 1] + 1; i < 10; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    dp[depth] = i;
                    backTracking(depth + 1);
                    visit[i] = false;
                }
            }
        }
    }
}