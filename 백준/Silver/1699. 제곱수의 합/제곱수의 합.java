import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dp = new int[100001];

    static int[] arr;
    static StringTokenizer st;
    static StringBuilder sb;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
      
        for (int i = 1; i <=100000; i++) {
            for(int j=1; j<=Math.sqrt(i); j++){
                if(dp[i]==0|| dp[i]>dp[i-(j*j)]+1){
                    dp[i]=dp[i-(j*j)]+1;
                }
            }
        }
        System.out.println(dp[n]);
    }
}

