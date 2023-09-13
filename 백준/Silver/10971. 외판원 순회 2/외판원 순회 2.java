import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int[][] arr;
    static int[] dp;
    static boolean[] visit;
    static StringTokenizer st;
    static StringBuilder sb;
    static int n;
    static int m = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        visit = new boolean[n + 1];
        dp = new int[n];
        backTracking(0);
        System.out.println(m);
    }

    static void backTracking(int depth) {
        if (depth == n) {
            int sum=0;
           for(int i=0; i<dp.length; i++){

               if(i==dp.length-1){
                   int x = arr[dp[i]][dp[0]];
                   if(x==0) return;
                   sum+=x;
                   continue;
               }
               int a = arr[dp[i]][dp[i + 1]];
               if(a==0) return;
               sum+=a;
           }
           m = Math.min(m,sum);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dp[depth] =i;
                backTracking(depth + 1);
                visit[i] = false;
            }
        }
    }
}


