import java.io.BufferedReader;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int start = 0;
        int end = m-1;
//        Arrays.sort(arr);
        int max= Integer.MIN_VALUE;
        while (end <= n-1) {
            int sum=0;
            for(int i=start; i<=end; i++){
               sum+=arr[i];
           }
           max = Math.max(sum,max);
           start++;
           end++;
        }
        System.out.println(max);
    }

}


