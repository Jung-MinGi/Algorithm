import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n =Integer.parseInt(br.readLine());
       int[] arr = new int[n];
       StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }
        long len=0;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for(int j=0;j<n;j++)len+=Math.abs(arr[i]-arr[j]);
        }
        System.out.println(len);
    }
}
