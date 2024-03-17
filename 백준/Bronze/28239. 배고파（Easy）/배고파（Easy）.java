import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static final long MAX = 1000000000000000000L;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            long ret = Long.parseLong(br.readLine());
            long a = 0;
            long b = 0;
            boolean flag = false;
            for (int i = 0; ; i++) {
                for (int j = 0; ; j++) {
                    a = 1L << i;
                    b = 1L << j;
                    if (a + b == ret) {
                        System.out.println(i + " " + j);
                        flag = true;
                        break;
                    }
                    if (a + b > MAX) break;
                }
                if (flag) break;
            }
        }

    }
}
