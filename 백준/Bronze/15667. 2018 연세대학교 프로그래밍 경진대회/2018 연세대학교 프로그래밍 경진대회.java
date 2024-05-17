import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) - 1;
        for (int i = 1; ; i++) {
            if (i * i + i == n) {
                System.out.println(i);
                return;
            }
        }
    }

}
