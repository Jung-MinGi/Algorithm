import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] ref;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ref =new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<n; i++){
            ref[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ref);
        int a = Integer.parseInt(br.readLine());
        int[] arr =new int[a];
        st = new StringTokenizer(br.readLine());
        for(int i=0 ; i<a; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(binarySearch(i)).append('\n');
        }
        System.out.print(sb);

    }
   static int binarySearch(int target){
        int low = 0;
        int high = ref.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(ref[mid] == target){

                return 1;

            }else if(ref[mid] > target){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return 0;
    }
}