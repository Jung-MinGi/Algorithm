import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static long[][] dp;
    //private static long[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        dp = new long[15][15];
        for(int i=0; i<15; i++){
            dp[0][i] = i;
            dp[i][1] = 1;
        }
        while(t-->0){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(recur(k,n));
        }
    }
    static long recur(int k, int n){
        if(dp[k][n]==0){
            dp[k][n]=recur(k,n-1)+recur(k-1,n);
        }
        return dp[k][n];
    }
}
