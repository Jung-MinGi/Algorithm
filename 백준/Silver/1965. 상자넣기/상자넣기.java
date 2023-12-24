import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Main {
    static int[] dp;
    static int[] arr;
    static int answer = 0;
    static int n = 0;
    static int m = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        dp[0]=1;
        for(int i=1;i<n;i++){
            dp(i);
        }
        for (int i : dp) {
            answer=Math.max(answer,i);
        }
        System.out.println(answer);


    }static int dp(int a){
        if(dp[a]==0){
            for(int i=a-1;i>=0;i--){
                if(arr[a]>arr[i]){
                    dp[a]=Math.max(dp(i),dp[a]);
                }
            }
            dp[a]++;
        }
        return dp[a];
    }
}
