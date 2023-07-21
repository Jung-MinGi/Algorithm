import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
static int[] arr1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            arr1 = new int[a];
            st = new StringTokenizer(br.readLine());
            for(int i= 0; i<a; i++){
                arr1[i]=Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr1);
            int b = Integer.parseInt(br.readLine());
            int[] arr2 = new int[b];
            st = new StringTokenizer(br.readLine());
            for(int i= 0; i<b; i++){
                arr2[i]=Integer.parseInt(st.nextToken());
            }

            for (int i : arr2) {
                int answer = bs(arr1, i);
                sb.append(answer).append('\n');
            }
        }
        System.out.println(sb);
    }static int bs(int[] arr,int target){
        int low = 0;
        int high = arr1.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr1[mid] == target){
                return 1;
            }else if(arr1[mid] > target){
                high = mid -1;
            }else low = mid+1;
        }
        return 0;
    }

}

