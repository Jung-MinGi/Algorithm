import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if (!solution(n) && !solution(m)) {
            System.out.println('=');
        } else if (solution(n) && !solution(m)) {
            System.out.println('>');
        } else if (!solution(n) && solution(m)) {
            System.out.println('<');
        } else {
            isChek(n, m);
        }

    }

    static boolean solution(int a) {
        switch (a) {
            case 0:
                return true;
            case 2:
                return true;
            case 5:
                return true;
            default:
                return false;
        }
    }

    static void isChek(int a, int b) {
        switch (a) {
            case 0:
                switch (b) {
                    case 0:
                        System.out.println('=');
                        break;
                    case 2:
                        System.out.println('>');
                        break;
                    case 5:
                        System.out.println('<');
                        break;
                }
                break;
            case 2:
                switch (b) {
                    case 0:
                        System.out.println('<');
                        break;
                    case 2:
                        System.out.println('=');
                        break;
                    case 5:
                        System.out.println('>');
                        break;

                }
                break;
            case 5:
                switch (b) {
                    case 0:
                        System.out.println('>');
                        break;
                    case 2:
                        System.out.println('<');
                        break;
                    case 5:
                        System.out.println('=');
                        break;
                }
                break;
        }
    }
}