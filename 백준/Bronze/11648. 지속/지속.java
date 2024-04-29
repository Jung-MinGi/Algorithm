import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (N >= 10) {
            cnt++;
            int tmp = 1;
            while (N >= 10) {
                tmp *= N % 10;
                N = N / 10;
            }

            N *= tmp;
        }
        System.out.println(cnt);
    }
}

