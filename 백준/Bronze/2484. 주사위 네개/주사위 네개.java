import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int tmp = 0;
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if (a == b && b == c && c == d) {
                tmp = 50000 + a * 5000;
            } else if (a == b && b == c || a == b && b == d || a == c && c == d) {
                tmp = 10000 + a * 1000;
            } else if (b == c && c == d) {
                tmp = 10000 + b * 1000;
            } else if (a == b&&c==d) {
                tmp = 2000 + a * 500 + c * 500;
            } else if (a == c&&b==d) {
                tmp = 2000 + a * 500 + b * 500;
            } else if (a == d&&b==c) {
                tmp = 2000 + a * 500 + b * 500;
            } else if (a==b||a==c||a==d) {
                tmp = 1000 + a * 100 ;
            }  else if (b==c||b==d) {
                tmp = 1000 + b * 100 ;
            } else if (c == d) {
                tmp = 1000 + c * 100;
            } else {
                tmp = Math.max(a, Math.max(b, Math.max(c, d))) * 100;
            }
            ans = Math.max(tmp, ans);
        }
        System.out.println(ans);
    }

}

