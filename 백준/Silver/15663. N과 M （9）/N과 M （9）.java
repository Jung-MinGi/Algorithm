import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int[] arr;
    static int[] dp;
    static boolean[] visit;
    static StringTokenizer st;
    static StringBuilder sb;
    static LinkedHashSet<String> set = new LinkedHashSet<>();
    static int N;
    static int M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(st.nextToken());
//            if(set.contains(k)) continue;
            arr[i] = k;

        }
        Arrays.sort(arr);
        visit = new boolean[arr.length];
        dp = new int[M];
        int depth = 0;
        sb = new StringBuilder();
        backTracking(depth);
        set.forEach(System.out::print);
    }

    static void backTracking(int depth) {
        if (depth == M) {
            sb = new StringBuilder();
            for (int i = 0; i < dp.length; i++) {
                sb.append(dp[i]).append(' ');
            }
            sb.append('\n');
            set.add(sb.toString());
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                dp[depth] = arr[i];
                visit[i] = true;
                backTracking(depth + 1);
                visit[i] = false;
            }
        }
    }
}


