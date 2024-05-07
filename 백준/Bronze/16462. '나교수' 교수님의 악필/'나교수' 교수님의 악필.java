import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        double sum=0.0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            int s = Integer.parseInt(br.readLine());
            while(s>0){
                int x = s % 10;
                if(x==0||x==6||x==9)sb.append(9);
                else sb.append(x);
                s=s/10;
            }
            sum += Math.min(Integer.parseInt(sb.reverse().toString()), 100);
        }
        System.out.println((int)Math.round(sum/n));
    }
}
