import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dp = new int[11];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp[1]=1;
        dp[2]=2;
        dp[3]=4;
        StringTokenizer st;
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            System.out.println(recur(Integer.parseInt(st.nextToken())));
        }



    }
    static int recur(int a){
       if(dp[a]==0){
           dp[a] = recur(a-1)+recur(a-2)+recur(a-3);
       }return dp[a];
    }
}