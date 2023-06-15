import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr;
        int k;
        long sum;
        StringTokenizer st;
        //StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            sum = 0;
            k = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            arr = new long[k];
            long[] max = new long[k];
            long val = -1;
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                if(val <= arr[i]){
                    val = arr[i];
                }else{
                    max[i-1] = val;
                    val = arr[i];
                }
            }
            if(arr[arr.length-2] <= arr[arr.length-1]){
                max[arr.length-1] = arr[arr.length-1];
            }
            long big=max[max.length-1];
            for(int i=max.length-2; i>=0; i--){
                if(big >= max[i]){
                    max[i]=0;
                }else{
                    big = max[i];
                }
            }
            int temp=0;
            //max배열 완성
            for(int i=0; i<max.length; i++){
                if(max[i]!=0){

                    for(int j=temp; j<i; j++){
                        sum = sum+(max[i]-arr[j]);
                    }
                    temp=i+1;
                }
            }
            //sb.append(sum).append('\n');
//            for (long i : max) {
//                System.out.println("max배열 = " + i);
//            }

            System.out.println(sum);
        }
    }
}