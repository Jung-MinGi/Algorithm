import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int z = Integer.parseInt(st.nextToken());


        if (z == 0) {

            System.out.println((int)Math.sqrt(x + y));
        } else if (x == 0) {
            double v = Math.pow(z, 2) - y;
            System.out.println((int)v);
        } else {
            double v = Math.pow(z, 2) - x;
            System.out.println((int)v);
        }
    }
}