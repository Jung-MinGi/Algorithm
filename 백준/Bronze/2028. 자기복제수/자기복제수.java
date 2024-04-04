import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for (int i = 0; i < tc; i++) {
            int idx = 1;
            int a = Integer.parseInt(br.readLine());
            int pow = (int) Math.pow(a, 2);
            for (int j = 0; j < String.valueOf(a).length(); j++) idx *= 10;
            System.out.println((pow % idx == a) ? "YES" : "NO");
        }
    }
}

