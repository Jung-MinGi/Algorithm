import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = Integer.toBinaryString(Integer.parseInt(st.nextToken()));
            int flag = Integer.parseInt(st.nextToken());
            int a = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') a++;
            }

            if (flag == 1 && a % 2 == 1) {

                System.out.println("Valid");
            } else if (flag == 0 && a % 2 == 0) {
                System.out.println("Valid");
            } else {

                System.out.println("Corrupt");
            }
        }
    }
}
