import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
       while(l<=100){
           int i = (n - (l * (l + 1) / 2));
           if(i%l==0&&i/l>=-1){
               StringBuilder sb = new StringBuilder();
               for(int k=(i/l)+1;k<=(i/l)+l;k++){
                   sb.append(k).append(' ');
               }
               System.out.println(sb);
               return;
           }else{
               l++;
           }
       }
        System.out.println(-1);
    }
}