import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    static int[] arr;
    static int[] dp;
    static boolean[] visit;
    static StringTokenizer st;
    static StringBuilder sb;

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        visit = new boolean[arr[arr.length-1]+1];
        dp = new int[M];
        int depth = 0;
        sb = new StringBuilder();
        backTracking(depth, M);
        System.out.println(sb);
    }
    static void backTracking(int depth, int M) {
        if (depth == M) {
            for (int i : dp) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visit[arr[i]]) {
                dp[depth] = arr[i];
                visit[arr[i]] = true;
                backTracking(depth + 1, M);
                visit[arr[i]] = false;
            }
        }
    }
}


