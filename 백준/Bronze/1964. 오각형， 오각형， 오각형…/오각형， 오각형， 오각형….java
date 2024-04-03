import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int mod = 45678;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long sum = 0;

        for (int i = n; i >= 0; i--) {
            sum += (i * 3L) + 1;
        }
        System.out.println(sum % mod);
    }
}


