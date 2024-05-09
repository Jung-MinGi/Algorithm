import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int price = Integer.MAX_VALUE;
        for (int i = 0; i <= Math.max(x, y); i++) {
            int tmp = 0;
            if (x - i > 0) tmp += (x - i) * a;
            if (y - i > 0) tmp += (y - i) * b;
            tmp += c * i * 2;
            price = Math.min(tmp, price);
        }
        System.out.println(price);
    }

}
