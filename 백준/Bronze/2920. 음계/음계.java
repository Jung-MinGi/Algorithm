import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[8];
           for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
           boolean flag = true;
           int start=0;
           int end=1;
           while(end < 8){
               if(Math.abs(arr[start]-arr[end])==1){
                   start++;
                   end++;
                   
               }else{
                   flag = false;
                   System.out.println("mixed");
                    break;
               }
           }
           if(flag){

               if(arr[0]-arr[1]==1) System.out.println("descending");
               else System.out.println("ascending");
           }
    }

}