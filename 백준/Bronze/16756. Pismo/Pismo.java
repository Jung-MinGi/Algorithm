import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min=Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            int a=0;
            if(arr[i]>arr[i-1])a=arr[i]-arr[i-1];
            else a=arr[i-1]-arr[i];
            min=Math.min(a,min);
        }
        System.out.println(min);

    }
}