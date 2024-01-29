import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double[] arr = new double[n];
        double[] dp = new double[n];
        double answer = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
            if(i==0)dp[i]=arr[i];
            else{
                dp[i]=Math.max(arr[i],dp[i-1]*arr[i]);
            }
            answer = Math.max(answer,dp[i]);
        }

        System.out.print(String.format("%.3f", answer));
    }
}