import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        if (plus(a, b, c)) return;
        else if (minus(a, b, c)) return;
        else if (multiply(a, b, c)) return;
        else {
            divide(a, b, c);
        }

    }

    static void divide(int a, int b, int c) {
        if (a / b == c) {
            System.out.println(a + "/" + b + "=" + c);
        } else if (b / c == a) {
            System.out.println(a + "=" + b + "/" + c);
        }
    }

    static boolean multiply(int a, int b, int c) {
        if (a * b == c) {
            System.out.println(a + "*" + b + "=" + c);
            return true;
        } else if (b * c == a) {
            System.out.println(a + "=" + b + "*" + c);
            return true;
        }
        return false;
    }

    static boolean plus(int a, int b, int c) {
        if (a + b == c) {
            System.out.println(a + "+" + b + "=" + c);
            return true;
        } else if (b + c == a) {
            System.out.println(a + "=" + b + "+" + c);
            return true;
        }
        return false;

    }

    static boolean minus(int a, int b, int c) {
        if (a - b == c) {
            System.out.println(a + "-" + b + "=" + c);
            return true;
        } else if (b - c == a) {
            System.out.println(a + "=" + b + "-" + c);
            return true;
        }
        return false;

    }
}
