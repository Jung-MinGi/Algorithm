import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] bs;
    static int[] arr;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        bs = new int[n];
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int cnt=0;
        bs[cnt]=arr[0];

        for(int i=1; i<n; i++){
            if(bs[cnt] < arr[i]){
                bs[++cnt]=arr[i];
            }else{
                int a = binarySearch(arr[i], cnt);
                bs[a]=arr[i];
            }
        }
        int answer=0;
        for (int b : bs) {
           if(b!=0) answer++;
        }
        System.out.println(answer);
    }
    static int binarySearch(int target,int cnt){
        int low=0;
        int high=cnt;
        while(low<high){
            int mid = (low+high)/2;
            if(bs[mid] >= target){
                high = mid;
            }else low = mid+1;
        }
    return low;
    }


}

