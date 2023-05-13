import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());//지방 개수
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max=0;
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > max){
                max=arr[i];
            }
        }
        int k = Integer.parseInt(br.readLine());//국가 예산

       int low=1;
       int high=max+1;

       while(low<high){
           int mid=(low+high)/2;
           int sum=0;
           for(int a:arr){
               if(a>=mid){
                   sum+=mid;
               }else sum+=a;
           }
           //upperbound
           if(k<sum){
               high=mid;
           }else{
               low=mid+1;
           }
       }
        System.out.println(low-1);
    }
}


