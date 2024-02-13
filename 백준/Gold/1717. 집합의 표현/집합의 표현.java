import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] set;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        set = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            set[i] = i;
        }
        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0) {
                union(b, c);
            } else {
                if (find(b) == find(c)) {
                    sb.append("YES").append('\n');
                } else sb.append("NO").append('\n');
            }
        }
        System.out.println(sb);
    }

    static int find(int x) {
        if (set[x] == x) return x;
       return set[x]=find(set[x]);
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a == b) return;
        if (a < b) {
            set[b] = a;
        } else set[a] = b;
    }
}