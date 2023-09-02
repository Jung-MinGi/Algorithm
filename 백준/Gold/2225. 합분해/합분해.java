import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] dp = new int[201][201];

    static Integer[] arr;
    static StringTokenizer st;
    static StringBuilder sb;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        for(int i=1; i<201; i++){
            dp[1][i]=i;
            dp[i][1]=1;
        }
        dp(200,200);
        System.out.println(dp[n][m]%1000000000);
        

    }
    static int dp(int n,int m) {
       if(dp[n][m]==0){
           dp[n][m]=dp(n,m-1)%1000000000+dp(n-1,m)%1000000000;
       }return dp[n][m];
    }
}

