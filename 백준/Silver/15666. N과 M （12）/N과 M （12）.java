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
        visit = new boolean[N];
        dp = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        backTracking( 0,0);
        set.forEach(System.out::print);

    }

    static void backTracking(int idx,int depth) {
        if (depth == M) {
            sb = new StringBuilder();
            for (int i : dp) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            set.add(sb.toString());
            return;
        }
        for (int i = idx; i < N; i++) {
//            if (!visit[i]) {
                visit[i] = true;
                dp[depth] = arr[i];
                backTracking(i,depth + 1);
                visit[i] = false;
//            }
        }

    }

}


