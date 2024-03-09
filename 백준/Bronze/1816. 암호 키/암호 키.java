import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static boolean[] prime = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if (!prime[i]) {
                for (int j = i * i; j < prime.length; j += i) prime[j] = true;
            }
        }
        prime[0] = prime[1] = true;
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            long x = Long.parseLong(br.readLine());
            boolean flag=true;
            for (int i = 2; i <prime.length; i++) {
               if(x%i==0){
                   flag=false;
                   break;
               }
            }
           if(flag)sb.append("YES").append('\n');
           else sb.append("NO").append('\n');
        }
        System.out.println(sb);

    }
}


