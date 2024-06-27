import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < p - 1; i++) {
            sb.append(1);
        }
        if (n == 0) {
            sb.append(0);
            System.out.println(sb);
        } else {
            sb.append(n);
            System.out.println(sb);
        }
    }
}
