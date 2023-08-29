import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long[][] dp;
    static int[][] arr;
    static int t;
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        dp=new long[t][t];
        arr=new int[t][t];
        for(int j=0; j<t; j++){
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<j+1; i++){
                arr[j][i]=Integer.parseInt(st.nextToken());
                dp[j][i]=-1;
            }
        }

        for(int i=0; i<t; i++){
           dp[t-1][i]=arr[t-1][i];
        }
        System.out.println(sum(0,0));
    }
    static long sum(int floor,int index){
      if(dp[floor][index] == -1){
          dp[floor][index]=Math.max(sum(floor+1,index),sum(floor+1,index+1))+arr[floor][index];
      }return dp[floor][index];
    }
}
