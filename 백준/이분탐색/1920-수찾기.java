import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < arr.length ; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] brr = new int[m];
        for(int i = 0 ; i < brr.length ; i++){
            brr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i : brr){
            boolean result = binarySearch(arr,i);
            if(result){
                System.out.println(1);
            }else System.out.println(0);
        }
    }
    static boolean binarySearch(int[] a, int b){
        int low = 0;
        int high = a.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(a[mid] == b){
                return true;
            }else if(a[mid] <= b){
                low = mid + 1 ;
            }else{
                high = mid - 1 ;
            }
        }
        return false;
    }
}

