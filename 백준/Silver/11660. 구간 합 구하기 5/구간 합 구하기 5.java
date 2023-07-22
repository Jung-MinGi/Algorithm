import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static int[][] dp;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n + 1][n + 1];
        dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                dp[i][1]=arr[i][1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            singleRowDp(i, n);

        }
        while (m-- > 0) {
            int sum=0;
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for(int i=a; i<=c; i++){
               sum+=dp[i][d]-dp[i][b-1];
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }

    static int singleRowDp(int i, int j) {
       if(dp[i][j]==0){
           dp[i][j] = singleRowDp(i,j-1)+arr[i][j];
       }
       return dp[i][j];
    }

}


