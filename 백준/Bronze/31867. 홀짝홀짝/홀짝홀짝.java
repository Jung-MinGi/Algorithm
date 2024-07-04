import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int even = 0;
        int odd = 0;

        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - '0';
            if (a % 2 == 0) even++;
            else odd++;
        }
        if (even > odd) {
            System.out.println(0);
        } else if (even < odd) {
            System.out.println(1);
        } else System.out.println(-1);

    }
}