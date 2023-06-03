import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String n = br.readLine();
        char[] arr = {'p','P','A','p'};
        int k=0;
        int cnt=0;
       for(int i=0; i<t; i++){
           if(n.charAt(i) == arr[k]  ){
               k++;
               if(k == arr.length){
                   k=0;
                  cnt++;
               }
           } else if (n.charAt(i) != arr[k] && k>=1) {
               k=0;
               if(n.charAt(i) == 'p'){
                   k=1;
               }
           }
       }
        System.out.println(cnt);
    }
}