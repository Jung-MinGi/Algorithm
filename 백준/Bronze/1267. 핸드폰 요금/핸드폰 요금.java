import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int y = 30;
    private static final int m = 60;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int i = Integer.parseInt(st.nextToken());
            a += i / y + 1;
            b += i / m + 1;
        }
        int x = a * 10;
        int y = b * 15;
        if (x == y) System.out.println("Y M " + x);
        else if (x > y) System.out.println("M " + y);
        else System.out.println("Y " + x);
    }
}
