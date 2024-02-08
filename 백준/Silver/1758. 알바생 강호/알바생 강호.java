import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static Long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new Long[n];
        for (int i = 0; i < n; i++) {
            arr[i] =Long.parseLong(br.readLine());

        }
//        quick_sort(arr,0,n-1);
        Arrays.sort(arr, Collections.reverseOrder());
        long tip=0;
        for(int i=0;i<n;i++){
            long tmp = arr[i]-(i+1-1);
            if(tmp<=0)break;
            tip+=tmp;
        }
        System.out.println(tip);
    }
 
}
