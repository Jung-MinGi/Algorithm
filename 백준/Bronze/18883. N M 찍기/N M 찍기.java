import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int idx = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                sb.append(idx);
                if (j != k - 1) sb.append(' ');
                idx++;
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

}
