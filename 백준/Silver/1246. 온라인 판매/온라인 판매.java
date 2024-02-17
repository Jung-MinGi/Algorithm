import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[] customer = new Integer[k];
        for (int i = 0; i < k; i++) {
            customer[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(customer, (Integer a, Integer b) -> b - a);
        int price = 0;
        int total = 0;
        int p = customer[0];
        while (true) {
            int egg=n;
            int tmp = 0;
            for (int i = 0; i < k; i++) {
                if (p <= customer[i]&&egg>0) {
                    tmp += p;
                    egg--;
                } else break;
            }
            if (tmp >= total) {
                total=tmp;
                price=p;
            }
            p--;
            if(p==0)break;
        }
        System.out.print(price+" "+total);
    }
}