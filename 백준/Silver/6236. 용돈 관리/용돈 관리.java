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
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        binarySearch(min, sum);
        //low = 배열 최소값
        //high=배열 총합
    }

    static boolean check(int mid) {
        //인출금액횟수가 주어진 값보다 작거나 같으면 true
        //보다 크면 false
        int sum=0;
        int cnt=0;
        for(int i=0; i<n; i++){
            if(sum+arr[i] > mid){
                sum=0;
                if(arr[i]>mid) return false;
                cnt++;
            }
            sum+=arr[i];
        }
        if(cnt!=0) cnt++;
        
        if(cnt <= m){
            return true;
        }else return false;
    }

    static void binarySearch(int min, int sum) {
        int low = min;
        int high = sum;

        while (low + 1 < high) {
            int mid = (low + high) / 2;

            if (check(mid)){
                high=mid;
            }else low = mid;
        }
        System.out.println(high);
    }
}