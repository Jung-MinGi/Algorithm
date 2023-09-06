import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * dp[i][0] = 96
 * dp[i][0] = 172
 * dp[i][0] = 185
 * dp[i][0] = 110
 * dp[i][0] = 178
 * dp[i][0] = 188
 * dp[i][0] = 156
 * dp[i][0] = 221
 * dp[i][0] = 231
 */
public class Main {
    static Integer[] dp;

    static Integer[] arr;
    static boolean[] visit;
    static StringTokenizer st;
    static StringBuilder sb;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr = new Integer[9];
        dp = new Integer[9];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        sb = new StringBuilder();
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = 0;
            for (Integer a : arr) {
                sum += a;
            }
            sum -= arr[i];
            for(int j=i+1; j<arr.length; j++){
                sum -= arr[j];
                if (sum == 100) {
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            sb.append(arr[k]).append('\n');
                        }
                    }
                    System.out.println(sb);
                    return;
                }else{
                    sum+=arr[j];
                }
            }
            
        }
    }
}

