import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visit;
    static int f;
    static int s;
    static int g;
    static int u;
    static int d;
    static int depth = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 1; i++) {
            f = Integer.parseInt(st.nextToken());
            s = Integer.parseInt(st.nextToken());//강호
            g = Integer.parseInt(st.nextToken());
            u = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
        }
        visit = new boolean[f + 1];

        int answer = bfs(s, 0, u, d);
        if (visit[g]) {
            System.out.println(answer);
        } else {
            System.out.println("use the stairs");
        }
    }

    static int bfs(int idx, int depth, int u, int d) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(idx);
        visit[idx] = true;
        /**
         * 80 45 32 5 19
         */
        if(idx == g) return depth;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Integer poll = q.poll();
                int a = poll + u;
                int b = poll - d;
                if ( a <= f && !visit[a] ) {
                    visit[a] = true;
                    q.offer(a);
                }
                if (b > 0 && !visit[b]) {
                    visit[b] = true;
                    q.offer(b);
                }
            }
            depth += 1;
            if (visit[g]) return depth;
        }
        return depth;
    }
}
