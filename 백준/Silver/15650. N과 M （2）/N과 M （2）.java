import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        visit = new boolean[N + 1];
        dp = new int[M];
        int depth = 0;
        sb = new StringBuilder();
        backTracking(1,depth, M);
        System.out.println(sb);
    }
    static void backTracking(int idx,int depth, int M) {
        if (depth == M) {
            for (int i : dp) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = idx; i <= N; i++) {
            if (!visit[i]) {
                dp[depth] = i;
                visit[i] = true;
                backTracking(i+1,depth + 1, M);
                visit[i] = false;
            }
        }
    }
}


