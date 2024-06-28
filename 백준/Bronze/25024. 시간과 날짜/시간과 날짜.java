import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < i; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x < 24 && y < 60) sb.append("Yes");
            else sb.append("No");
            sb.append(' ');
            if (x > 0 && x < 13) {
                if (x == 2) {
                    if (y > 0 && y < 30) sb.append("Yes");
                    else sb.append("No");
                } else if (x == 4 || x == 6 || x == 9 || x == 11) {
                    if (y > 0 && y < 31) sb.append("Yes");
                    else sb.append("No");
                } else {
                    if (y > 0 && y < 32) sb.append("Yes");
                    else sb.append("No");
                }
            } else {
                sb.append("No");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
