import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer=0;
        int n =Integer.parseInt(br.readLine());
        if(n==1){
            System.out.println(1);
            return;
        }
        for (int i = 1; i < Math.sqrt(n); i++) {
            if(n%i==0)answer++;
        }
        answer*=2;
        int a = (int) Math.sqrt(n);
        if(a*a==n)answer++;
        System.out.println(answer);
    }

}
