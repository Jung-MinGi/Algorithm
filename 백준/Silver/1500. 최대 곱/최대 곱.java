import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long answer = 1;
    static int n = 0;
    static int m = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int a = n / m;
        int b = n % m;
        for (int i = 1; i <= m; i++) {
            if (i <= b) answer *= (a + 1);
            else answer *= a;
        }
        System.out.println(answer);
    }
}


