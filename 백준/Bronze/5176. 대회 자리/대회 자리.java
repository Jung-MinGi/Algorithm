import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            boolean[] visit = new boolean[k + 1];
            int cnt = 0;
            while (m-- > 0) {
                int i = Integer.parseInt(br.readLine());
                if (visit[i]) cnt++;
                else visit[i] = true;

            }
            System.out.println(cnt);
        }
    }
}
