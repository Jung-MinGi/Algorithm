import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visit = new boolean[101];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (n-- > 0) {
            int i = Integer.parseInt(st.nextToken());
            if (visit[i]) ans++;
            else visit[i] = true;
        }
        System.out.println(ans);
    }
}
