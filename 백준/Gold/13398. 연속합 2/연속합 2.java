import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static Integer[][] dp;

    static int[] arr;
    static StringTokenizer st;
    static StringBuilder sb;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
     dp=new Integer[2][n+1];
     arr = new int[n+1];
     st = new StringTokenizer(br.readLine());
     for(int i=1; i<arr.length; i++){
         arr[i]=Integer.parseInt(st.nextToken());
     }
     dp[0][1]=arr[1];
     dp[1][1]=arr[1];
     int max=arr[1];
     for(int i=2; i<arr.length; i++) {
         max=Math.max(max,dp(0, i));
         max=Math.max(max,dp(1, i));
     }
        System.out.println(max);
     }

    static int dp(int x, int y) {
        if(dp[x][y]==null){
            if(x==0){
                dp[x][y]=Math.max(dp(x,y-1)+arr[y],arr[y]);
            }else{
                dp[x][y]=Math.max(dp(0,y-1),dp(x,y-1)+arr[y]);
            }
        }return dp[x][y];

    }



}

