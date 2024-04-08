import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = (int) Math.pow(10, Integer.parseInt(st.nextToken()));
        double v = a / (double) b;

        long x = (long) (Math.round(v) * b);
        System.out.println(x);
    }
}
