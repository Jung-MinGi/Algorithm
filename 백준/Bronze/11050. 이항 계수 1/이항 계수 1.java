import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(combination(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }
    static int combination(int a, int b) {
        if (a == b || b == 0) return 1;
        return combination(a - 1, b - 1) + combination(a - 1, b);
    }
}
