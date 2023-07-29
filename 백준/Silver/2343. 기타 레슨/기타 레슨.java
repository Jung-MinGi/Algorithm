import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static int[] arr;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());//강의 개수
        m = Integer.parseInt(st.nextToken());//블루레이 개수
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(max < arr[i]){
                max=arr[i];
            }
        }
        binary(max);

    }
    static void binary(int a){
        int low=a;
        int high=1000000000;

        while(low <= high){
            int mid = (low+high)/2;
            int sum=0;
            int cnt=0;
            for(int i=0; i<n; i++){
                if(sum+arr[i] > mid){
                    cnt++;
                    sum=0;
                }
                sum+=arr[i];
            }
            if(sum!=0) cnt++;

            if(cnt > m){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println(low);
    }
}