import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {

    static String[] arr;
    static String[] dp;
    static boolean[] visit;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int m = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new String[m];
        visit = new boolean[m];
        dp = new String[n];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++){
            arr[i] =st.nextToken();
        }
        Arrays.sort(arr);
        backTracking(0,0);
        System.out.println(sb);
    }

    static void backTracking(int idx, int depth) {
        if (depth == n) {
            int x=0;//모음
            int y=0;
            for (String s : dp) {
                if(s.equals("a")||s.equals("e")||s.equals("i")||s.equals("o")||s.equals("u")) x++;
                else y++;
            }
            if(x>=1 && y>=2){
                for (String s : dp) {
                    sb.append(s);
                }
                sb.append('\n');
            }
            return;
        }
        for (int i = idx; i < m; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dp[depth] = arr[i];
                backTracking(i + 1, depth + 1);
                visit[i] = false;
            }
        }
    }
}


