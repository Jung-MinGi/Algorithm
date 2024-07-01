import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int j = 1; ; j++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            double min = Double.MAX_VALUE;
            int a = 0;
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                double cost = findCost(x, Integer.parseInt(st.nextToken()));
                if (min > cost) {
                    min = cost;
                    a = x;
                }
            }
            System.out.println("Menu " + j + ": " + a);
        }
    }

    static double findCost(int inch, int price) {
        double v = Math.pow(inch / 2.0, 2) * Math.PI;
        return price / v;
    }
}
