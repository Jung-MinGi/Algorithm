import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static long n;
    static long k;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Long.parseLong(st.nextToken());
        k = Long.parseLong(st.nextToken());
        long num = n;
        long x = 0;
        long y = 0;
        while (true) {

            long tmp = k / (num / n);

            if (num <= tmp) {
                long gcd = findGCD(num, tmp);
                if(gcd==n && (tmp*num)/gcd==k){
                    x=num;
                    y=tmp;
                }
            }else break;

            num += n;
        }
        System.out.println(x+" "+y);
    }

    static long findGCD(long x, long y) {
         if(y==0) return x;
        return findGCD(y,x%y);

    }

}