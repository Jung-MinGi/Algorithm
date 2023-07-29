import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static int[] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        dp = new int[n];
        dp[0] = 1;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[j]>arr[i]){
                    dp[i]=Math.max(dp[j],dp[i]);
                }
            }
            dp[i]=dp[i]+1;
        }
        int max=Integer.MIN_VALUE;
        for (int i : dp) {
            if(i > max){
                max=i;
            }
        }
        System.out.println(max);
    }


}



