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
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer=0;
        int sum=0;
        for (int i = 0; i < n - 2; i++) {
            sum+=arr[i];
            for (int j = i + 1; j < n - 1; j++) {
                sum+=arr[j];
                for (int k = j + 1; k < n; k++) {
                    sum+=arr[k];
                    if(sum==m){
                        System.out.println(sum);
                        return;
                    }else if(sum>m){
                        sum-=arr[k];
                    }else{
                        answer=Math.max(sum,answer);
                        sum-=arr[k];
                    }
                }
                sum-=arr[j];
            }
            sum-=arr[i];
        }
        System.out.println(answer);
    }
}
