import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    static int n, s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        s = Integer.parseInt(br.readLine());
        int[] arr =new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        int sum;
        int cnt=0;
        while(start<end){
            sum = arr[start]+arr[end];
            if(sum<=s){
                start++;
                if(sum==s) cnt++;
            }else{
                end--;
            }
        }
        System.out.println(cnt);
    }
}


