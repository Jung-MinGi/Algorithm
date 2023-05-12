import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        long low=1;
        long high=n*n;
        while(low<high){
            long x = (low+high)/2;
            long cnt=0;
            for(int i=1; i<=n; i++){
                cnt += Math.min(x/i,n);

            }if(k <= cnt){
                    high=x;
                }else {
                low=x+1;
            }

        }
        System.out.println(low);
    }
}