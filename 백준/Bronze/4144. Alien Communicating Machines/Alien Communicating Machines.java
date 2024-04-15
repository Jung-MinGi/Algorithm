import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[] arr = new char[36];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            StringBuilder sb = new StringBuilder(st.nextToken()).reverse();
            long x = 0;
            for (int i = 0; i < sb.length(); i++) {
                long pow = (long) Math.pow(a, i);
                char c = sb.charAt(i);
                if (Character.isUpperCase(c)) {
                    int i1 = (c - 'A') + 10;
                    x += pow * i1;
                } else {
                    int i1 = c - '0';
                    x += pow * i1;
                }
            }
            System.out.println(soultion(b, x));
        }

    }

    static String soultion(int a, long x) {
        StringBuilder sb = new StringBuilder();
        while (x > 1) {
            if (x % a >= 10) {
                sb.append(arr[(int) (x % a)]);
            }
           else sb.append(x % a);
            x = x / a;
        }
        if (x == 1) {
            sb.append(x);
            return sb.reverse().toString();
        }
        return (sb.length() == 0) ? "0" : sb.reverse().toString();
    }

    static void init() {
        for (int i = 10; i < arr.length; i++) {
            arr[i] = (char) (i + 55);
        }
    }
}
