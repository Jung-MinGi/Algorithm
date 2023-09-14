import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int[] dp;
    static int n;
    static int m=Integer.MAX_VALUE;
    static boolean[] visit;
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new int[n / 2];
        visit = new boolean[n + 1];
        arr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        backTracking(1,0);
        System.out.println(m);
    }

    static void backTracking(int idx,int depth) {
        if (depth == n / 2) {
            int start = 0;
            int link = 0;
            int[] linkArr = new int[n / 2];
            int cnt = 0;
            for (int i = 1; i <= n; i++) {
                if (!visit[i]) {
                    linkArr[cnt] = i;
                    cnt++;
                }
            }
            for(int i=0; i<n/2-1; i++){
                for(int j=i+1; j<n/2; j++){
                    start+=arr[dp[i]][dp[j]]+arr[dp[j]][dp[i]];
                    link+=arr[linkArr[i]][linkArr[j]]+arr[linkArr[j]][linkArr[i]];

                }
            }
            m = Math.min(m, Math.abs(start-link));
            return;
        }
            for (int i = idx; i <= n; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    dp[depth] = i;
                    backTracking(i,depth + 1);
                    visit[i] = false;
                }
            }
        }
    }