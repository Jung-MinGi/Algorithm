import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n * 2];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            arr[n + i] = arr[i];
        }
        int answer=0;
        int max = 0;
        for (int i = 0; i < m - 1; i++) {
            max += arr[i];
        }
        for(int i=m-1;i<arr.length;i++){
            max+=arr[i];
            answer = Math.max(answer,max);
            max-=arr[i-m+1];
        }
        System.out.println(answer);
    }
}
