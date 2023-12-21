import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    static Integer[][] dp;
    static int n;
    static int k;
    static int[] weight;
    static int[] value;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         k = Integer.parseInt(st.nextToken());
        dp = new Integer[n + 1][k + 1];
        Arrays.fill(dp[0], 0);
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        weight = new int[n+1];
        value = new int[n+1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }
       for(int i=1;i<=n;i++){
           for(int j=0;j<=k;j++){
               if(weight[i]<=j){
                   dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);
               }else{
                   dp[i][j]=dp[i-1][j];
               }
           }
       }
        System.out.println(dp[n][k]);

    }



}
