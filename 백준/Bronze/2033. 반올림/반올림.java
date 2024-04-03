import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i =10;
        int n =Integer.parseInt(br.readLine());
        while(n>i){
            if(n%i<i/2){
                n=n-n%i;
            } else if (n%i>=i/2) {
                n=n-n%i;
                n+=i;
            }
            i*=10;
        }
        System.out.println(n);
    }
}

