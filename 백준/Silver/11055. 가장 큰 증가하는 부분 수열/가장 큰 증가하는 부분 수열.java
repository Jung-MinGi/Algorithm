import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] sum = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sum[0]=arr[0];

        int max=sum[0];
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                if(arr[i] > arr[j]){
                    if(sum[i] > arr[i]+ sum[j]) continue;
                    sum[i] = arr[i]+ sum[j];
                }else if(arr[i] == arr[j]){
                    sum[i]=arr[i];
                }else{
                    if(sum[i] < arr[i]){
                        sum[i] = arr[i];
                    }
                }
            }
            max = Math.max(sum[i],max);
        }
        System.out.println(max);
    }
}
