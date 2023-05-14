import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[] arr = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int max=0;
        for(int i=0; i<=n-3; i++){
            for(int j=i+1; j<=n-2; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i]+arr[j]+arr[k]<= target){
                        max=Math.max(max,arr[i]+arr[j]+arr[k]);
                    }
                }
            }
        }
        System.out.println(max);
    }
}