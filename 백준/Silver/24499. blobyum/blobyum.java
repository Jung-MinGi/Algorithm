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
        int[] preFixSum = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(i==0)preFixSum[i]=arr[i];
            else preFixSum[i]=preFixSum[i-1]+arr[i];
        }
        if(n==m){
            System.out.println(preFixSum[n-1]);
            return;
        }
        int answer=0;
        for(int i=0;i<m;i++)answer+=arr[i];
        for(int i=1;i<arr.length;i++){

            if(i+m<=n){
                if(i+m==n){
                    answer = Math.max(answer,preFixSum[i+m-1]-preFixSum[i-1]);
                }
                else answer = Math.max(answer,preFixSum[i+m]-preFixSum[i]);
            }
            else{
                answer = Math.max(answer,preFixSum[n-1]-preFixSum[i-1]+preFixSum[(i+m)%n-1]);
            }
        }
        System.out.println(answer);
    }
}
