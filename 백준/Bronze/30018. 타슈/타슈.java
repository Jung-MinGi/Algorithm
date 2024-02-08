import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static Integer[] arr;
    static Integer[] brr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new Integer[n];
        brr = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            brr[i] = Integer.parseInt(st.nextToken());
        }
//        Arrays.sort(brr, Collections.reverseOrder());
        int bike=0;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]<brr[i]){
                bike+=brr[i]-arr[i];
            }
//            else{
//                bike-=(arr[i]-brr[i]);
//                cnt+=(arr[i]-brr[i]);
//            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>brr[i]){
                int a = arr[i] - brr[i];
                brr[i]+=a;
                cnt+=a;
                bike-=a;
            }
        }
        System.out.println(cnt);
    }

}
