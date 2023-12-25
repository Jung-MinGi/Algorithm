import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(factorial(a)/(factorial(a-b)*factorial(b)));
    }

    static int factorial(int a) {
        if (a == 1 || a == 0) return 1;
        return a * factorial(a - 1);
    }
}
