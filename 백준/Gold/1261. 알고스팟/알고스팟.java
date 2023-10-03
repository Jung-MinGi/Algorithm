import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static Integer[][] map = new Integer[0][0];
    static boolean[][] visit = new boolean[0][0];
    static StringTokenizer st;
    static int n, m;
    static int min = Integer.MAX_VALUE;

    static class Node implements Comparable<Node> {
        int x;
        int y;
        int val;

        public Node(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Node o) {
            return this.val-o.val;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new Integer[n + 1][m + 1];
        visit = new boolean[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            for (int j = 1; j <= m; j++) {
                map[i][j] = s.charAt(j - 1) - '0';
            }
        }
        System.out.println(bfs(1, 1));
    }

    static int bfs(int x, int y) {
        int[] m1 = {1, -1, 0, 0};
        int[] m2 = {0, 0, 1, -1};
        Queue<Node> q = new PriorityQueue<>();
        q.add(new Node(x,y,0));
        visit[x][y] = true;
        while (!q.isEmpty()) {
            Node poll = q.poll();
            if (poll.x == n && poll.y == m) return poll.val;
            for (int i = 0; i < 4; i++) {
                int nx = poll.x + m1[i];
                int ny = poll.y + m2[i];
                if (nx >= 1 && nx <= n && ny >= 1 && ny <= m) {
                   if(!visit[nx][ny]){
                       visit[nx][ny]=true;
                       if(map[nx][ny]==0){
                           q.add(new Node(nx,ny,poll.val));
                       }else{
                           q.add(new Node(nx,ny, poll.val+1));
                       }
                   }
                }

            }
        }
        return 0;
    }

}
