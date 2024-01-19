import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(n-->0){
            int max=Integer.MIN_VALUE;
            int a = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[a];
            for(int i=0;i<a;i++){
                arr[i]=Integer.parseInt(st.nextToken());
                max = Math.max(arr[i],max);
            }
            for(int i=2;i<=a;i++){
                int sum=0;
                for(int j=0;j<i-1;j++){
                    sum+=arr[j];
                }
                for(int k=i-1;k<a;k++){
                    sum+=arr[k];
                    max = Math.max(sum,max);
                    sum-=arr[k-i+1];
                }
            }
            sb.append(max).append('\n');

        }
        System.out.println(sb);
    }
}

