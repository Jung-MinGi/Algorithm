import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int min = 100;
        int x = 0;
        int y = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j < min&&i*j>=n) {
                    x = i;
                    y = j;
                    min=i+j;
                }
            }
        }
        System.out.println(x + " " + y);
    }


}
