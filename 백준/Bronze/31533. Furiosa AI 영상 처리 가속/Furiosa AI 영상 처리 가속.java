import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m =Integer.parseInt(st.nextToken());
        int n =Integer.parseInt(st.nextToken());
        double v = m / a;
        double x = n / a;
        double min1 = Math.min(2 * v, Math.min(Math.max(v,n), 2 * n));
        double min2 = Math.min(2 * x, Math.min(Math.max(x,m), 2 * m));
        System.out.printf("%.6f",Math.min(min1,min2));
    }
}

