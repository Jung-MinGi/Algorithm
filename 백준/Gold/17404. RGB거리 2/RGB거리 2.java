import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Integer[][] dp;

    static Integer[][] arr;
    static StringTokenizer st;
    static StringBuilder sb;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Integer[n + 1][3];
        arr = new Integer[n + 1][3];
        for (int i = 1; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
            arr[i][2] = Integer.parseInt(st.nextToken());
        }

        int result=Integer.MAX_VALUE;
        int[] answer = new int[3];
        for(int j=0; j<3; j++){
            dp[1][0] = dp[1][1] = dp[1][2] =1001;
            dp[1][j]=arr[1][j];
            for (int i = 2; i <= n; i++) {
                dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2])+arr[i][0];
                dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2])+arr[i][1];
                dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1])+arr[i][2];
                if(i==n){
                    if(j==0){
                        result=Math.min(dp[i][1],dp[i][2]);
                    }else if(j==1){
                        result=Math.min(dp[i][0],dp[i][2]);
                    }else{
                        result=Math.min(dp[i][0],dp[i][1]);
                    }
                }
            }
           answer[j]=result;

        }
        for (int i : answer) {
            result = Math.min(i,result);
        }
        System.out.println(result);
    }
}

