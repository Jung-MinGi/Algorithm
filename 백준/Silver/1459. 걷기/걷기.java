import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long ret1 =  (a + b) * x;
        long ret2 = 0;
        long ret3 = 0;

        if ((a + b) % 2 == 0) ret2 =  Math.max(a, b) * y;
        else {
            ret2 =  (Math.max(a, b) - 1) *y+x;
        }
        ret3 = (Math.min(a, b) * y) + (Math.abs(a - b) * x);
        System.out.println(Math.min(ret1,Math.min(ret2,ret3)));
    }
}
