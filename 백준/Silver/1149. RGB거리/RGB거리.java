import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] dp;
    static int[][] cost;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        dp=new int[t][3];
        cost=new int[t][3];
        for(int i=0; i<t; i++){
            st = new StringTokenizer(br.readLine());
            cost[i][0]=Integer.parseInt(st.nextToken());
            cost[i][1]=Integer.parseInt(st.nextToken());
            cost[i][2]=Integer.parseInt(st.nextToken());
        }
        dp[0][0]=cost[0][0];
        dp[0][1]=cost[0][1];
        dp[0][2]=cost[0][2];
        System.out.println(Math.min(costSearch(t-1,0),Math.min(costSearch(t-1,1),costSearch(t-1,2))));
    }
    static int costSearch(int n,int num){
        if(dp[n][num]==0){
            if(num==0){
                dp[n][0]=Math.min(costSearch(n-1,1),costSearch(n-1,2))+cost[n][0];
            }else if(num==1){
                dp[n][1]=Math.min(costSearch(n-1,0),costSearch(n-1,2))+cost[n][1];
            }else{
                dp[n][2]=Math.min(costSearch(n-1,0),costSearch(n-1,1))+cost[n][2];
            }
        }return dp[n][num];
    }
}


