import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());//나무의 개수
        int k = Integer.parseInt(st.nextToken());//목표 나무길이
        int[] arr = new int[n];
        int max = -1;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
            if(arr[i]>max){
                max=arr[i];
            }
        }
      //upperbound 이용
        System.out.println(upperBound(arr, k, max)-1);
    }
    static int upperBound(int[] a, int k,int max){
        int low=0;
        int high=max;
        while(low < high){
            int mid = (low+high)/2;
            long tree = cutting(a, mid);
            if(k > tree){
                high = mid;
            }else low = mid+1;
        }return high;
    }
    static long cutting(int[] aa, int mid){
        long sum=0;
        for(int x: aa){
            if(x-mid>0){
                sum+=x-mid;
            }
        }
        return sum;
    }
}


