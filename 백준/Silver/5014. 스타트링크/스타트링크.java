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
        //강호가 회사보다 아래에 있으면서 u가 0일때
        if (s < g && u == 0 && d != 0) {
            System.out.println("use the stairs");
        }
        //강호가 회사보다 위에 있으면서 d가 0일떄
        else if (s > g && d == 0&& u != 0) {
            System.out.println("use the stairs");
        }
        else if (s + u > f && s - d < 1) {
            System.out.println("use the stairs");
        }
        else if (s != g && u == 0 && d == 0) {
            System.out.println("use the stairs");
        } else if(s == g){
            System.out.println(0);
        }else{
            int answer = bfs(s, 0, u, d);
            if(visit[g]){
                System.out.println(answer);
            }else{
                System.out.println("use the stairs");
            }
        }
    }

    static int bfs(int idx, int depth, int u, int d) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(idx);
        visit[idx] = true;
        /**
         * 80 45 32 5 19
         */
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Integer poll = q.poll();

                int a = poll + u;
                int b = poll - d;
                if (a > 0 && a <= f && !visit[a] && a != poll) {
                    visit[a] = true;
                    q.offer(a);
                }
                if (b > 0 && b <= f && !visit[b] && b != poll) {
                    visit[b] = true;
                    q.offer(b);
                }
            }
            depth+=1;
            if (visit[g]) return depth;
        }return depth;
    }
}
