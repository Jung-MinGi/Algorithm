import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //private static int[] dp ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max=0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum=0;
        while(n-->0){
            int a = Integer.parseInt(st.nextToken());
            sum+=a;
            max= Math.max(max,a);
        }
        System.out.println(sum-max);
    }
}

