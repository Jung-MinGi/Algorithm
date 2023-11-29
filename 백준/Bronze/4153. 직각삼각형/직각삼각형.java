import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
       while(true){
           int[] arr = new int[3];
           StringTokenizer st = new StringTokenizer(br.readLine());
           arr[0] = Integer.parseInt(st.nextToken());
           arr[1] = Integer.parseInt(st.nextToken());
           arr[2] = Integer.parseInt(st.nextToken());
           if(arr[1]==0) break;
           Arrays.sort(arr);
           if(Math.pow(arr[2],2)==Math.pow(arr[0],2)+Math.pow(arr[1],2)){
               sb.append("right").append('\n');
           }else{
               sb.append("wrong").append('\n');
           }
       }
        System.out.println(sb.toString());
    }
}


