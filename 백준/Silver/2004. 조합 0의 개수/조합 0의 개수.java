import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int two = two(n)-two(n-m)-two(m);
        int five = five(n)-five(n-m)-five(m);
        System.out.println(Math.min(two,five));
    }

    static int five(int n) {
        int tmp = 0;
        while (n >= 5) {
            tmp += n / 5;
            n = n / 5;
        }
        return tmp;
    }
    static int two(int n) {
        int tmp = 0;
        while (n >= 2) {
            tmp += n / 2;
            n = n / 2;
        }
        return tmp;
    }
}
