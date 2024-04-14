import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum=0;
        for (int i = 1; i <= n; i++) {
            int a = i * (i + 1) + (i * (i + 1) / 2);
            sum += a;
        }
        System.out.println(sum);
    }
}
