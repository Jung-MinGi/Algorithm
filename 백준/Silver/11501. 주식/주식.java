import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr;
        int k;
        long sum;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            sum = 0;
            k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            arr = new long[k];
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long big=0;
            for(int i=arr.length-1; i>=0; i--){
                if(arr[i] > big){
                    big =arr[i];
                }else{
                    sum+=(big-arr[i]);
                }
            }

            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}