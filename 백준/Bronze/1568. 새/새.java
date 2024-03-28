import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n =Integer.parseInt(br.readLine());
       int idx=1;
       int count=0;
       while(n!=0){
            if(idx<=n){
                n-=idx;
                idx++;
                count++;
            }else {
                idx=1;

            }
        }
        System.out.println(count);
    }
}
