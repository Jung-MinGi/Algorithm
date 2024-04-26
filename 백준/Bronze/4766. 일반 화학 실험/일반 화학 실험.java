import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        while (true) {
            double v = Double.parseDouble(br.readLine());
            if (v == 999) break;
            System.out.printf("%.2f\n", v - a);
            a = v;
        }
    }
}
