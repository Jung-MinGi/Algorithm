import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int j = 0; j < 100; j++) {
            for (int k = 0; k < 100; k++) {
                if ((n - j - k) == 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);


    }


}
