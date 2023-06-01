import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int[] dp ;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1000-Integer.parseInt(br.readLine());
        int cnt=0;
        int[] arr = {500,100,50,10,5,1};
       for(int a: arr){
           cnt+=n/a;
           n=n%a;
       }
        System.out.println(cnt);
}
}
