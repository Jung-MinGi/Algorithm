import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            int a = Integer.parseInt(br.readLine());
            long n = 1;
            for (int j = 2; j <= a; j++) {
                n *= j;
                while (n % 10 == 0) n = n / 10;
                n = n % 1000000000000000L;
            }
            System.out.println(n % 10);
        }
    }
}
