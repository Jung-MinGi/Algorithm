import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int[] arr =new int[51];
        while((n=Integer.parseInt(br.readLine()))!=0){
            binarySearch(arr,n);
        }

    }
    static void binarySearch(int[] arr, int target){
        StringBuilder sb = new StringBuilder();
        int low = 1;
        int high = 50;
        while(low<=high){//이분탐색에서 조건에 = 붙여라 low,high가 한 군데로 모아진다
            int mid =(low+high)/2;
            sb.append(mid).append(' ');

            if(mid == target){
                break;
            }else if(mid > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        System.out.println(sb);
    }
}