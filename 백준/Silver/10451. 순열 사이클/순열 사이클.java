import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            boolean[] visit = new boolean[x + 1];
            int[] comp = new int[x + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i < comp.length; i++) {
                comp[i] = Integer.parseInt(st.nextToken());
            }
            int cnt = 0;
            for (int i = 1; i < comp.length; i++) {
                if (visit[i]) continue;
                if (comp[i] == i) {
                    visit[i] = true;
                    cnt++;
                } else {
                    visit[i] = true;
                    int previdx = i;
                    int next = comp[i];
                    do {
                        visit[next] = true;
                        previdx = next;
                        next = comp[next];
                        if (visit[next]) break;
                    } while (comp[next] != previdx);
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
