import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    static long n = 0;
    static long m = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Long.parseLong(st.nextToken());
        m = Long.parseLong(st.nextToken());
        long gcd = gcd(n, m);

        StringBuilder sum= new StringBuilder();
        for(int i=0;i<gcd;i++){
            sum.append("1");
        }
        System.out.println(sum);
    }
    static long gcd(long n,long m) {
        if(m==0)return n;
        return gcd(m,n%m);
    }

}