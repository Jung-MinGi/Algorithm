import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n =Integer.parseInt(br.readLine());
       int[] arr = new int[n];
       StringTokenizer st = new StringTokenizer(br.readLine());
       for(int i=0;i<n;i++){
           arr[i]=Integer.parseInt(st.nextToken());
       }
       int gcdMin=Integer.MAX_VALUE;
       for(int i=0;i<n-1;i++){
           for(int j=i+1;j<n;j++){
               gcdMin=Math.min(gcd(arr[i],arr[j]),gcdMin);
           }
       }
       StringBuilder sb = new StringBuilder();
       for(int i=1;i<=gcdMin;i++){
           boolean flag=false;
           for(int j=0;j<n;j++){
               if(arr[j]%i!=0){
                   flag=true;
                   break;
               }
           }
           if(!flag) sb.append(i).append('\n');
       }
        System.out.println(sb);
    }
    static int gcd(int a,int b){
        if(a%b==0)return b;
        else return gcd(b,a%b);
    }
}
