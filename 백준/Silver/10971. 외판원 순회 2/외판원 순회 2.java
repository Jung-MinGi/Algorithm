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
//        dp = new int[n];
        for (int i = 1; i <= n; i++) {
            visit[i] = true;
            backTracking(i,i,0,0);
            visit[i]=false;
        }
        System.out.println(m);
    }

    static void backTracking(int startIndex, int idx, int sum, int depth) {
        if (depth == n-1) {
            if(arr[idx][startIndex]!=0){
                sum+=arr[idx][startIndex];
                m = Math.min(m, sum);
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            if(!visit[i] && arr[idx][i]!=0){
                visit[i]=true;
                backTracking(startIndex,i,sum+arr[idx][i],depth+1);
                visit[i]=false;
            }
        }
    }
}


