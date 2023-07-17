import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] visit;
    static int[][] w;
    static long min = Long.MAX_VALUE;
   static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        w = new int[n][n];
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                w[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        arr = new int[n];
        visit = new boolean[n];
        dfs(0);
        System.out.println(min);
        }
    static void dfs(int depth){
        if(depth == n){
            int sum=0;
            for (int i=0; i<n; i++) {
                if (i != n - 1 && w[arr[i]][arr[i + 1]] != 0) {
                    sum += w[arr[i]][arr[i + 1]];
                } else if(i == n-1 && w[arr[i]][arr[0]] != 0){
                    sum += w[arr[i]][arr[0]];
                } else{
                    return;
                }
            }

            min = Math.min(min, sum);
            if(sum == 5){
                for (int i : arr) {
                    System.out.println("i = " + i);
                }
            }
            return;
        }

        for(int i=0; i<n; i++){
            if (!visit[i]) {
                arr[depth]=i;
                visit[i]=true;
                dfs(depth+1);
                visit[i]=false;
            }
        }
    }

}
