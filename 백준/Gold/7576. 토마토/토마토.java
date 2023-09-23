import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Stream;

class Main {
    static Integer[][] map;
    static Integer[][] dp;
    static boolean[][] visit;
    static int answer = 0;
    static StringTokenizer st;
    static int n, m;
    static Queue<int[]> q = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new Integer[n + 1][m + 1];
        visit = new boolean[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                int a = Integer.parseInt(st.nextToken());
                if (a == 1) {
                    visit[i][j] = true;
                    q.add(new int[]{i, j});//제일 처음 익은 토마토
                }
                map[i][j] = a;
            }
        }
        q.add(new int[]{-1,-1});
        bfs();
        int cnt=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(map[i][j]==0){
                    cnt++;
                    System.out.println(-1);
                    return;
                }
            }
        }
        if(answer == 0 || cnt==0){
            System.out.println(answer);
        }
    }


    //    static void dfs(int x, int y, int depth) {
//        if(x==n && y==m){
//            answer =Math.min(answer,depth);
//        }
//        visit[x][y]=true;
//        dp[x][y]=depth;
//        int[] mv1 = {0, 0, 1, -1};
//        int[] mv2 = {1, -1, 0, 0};
//        for (int i = 0; i < mv1.length; i++) {
//            int nx = x + mv1[i];
//            int ny = y + mv2[i];
//
//            if (nx >= 1 && nx <= n && ny >= 1 && ny <= m) {
//                if (!visit[nx][ny] && map[nx][ny] == 1) {
//                    visit[nx][ny] = true;
//                    dfs(nx, ny, depth + 1);
//                }
//            }
//        }
//    }
    static void bfs() {
        int[] mv1 = {0, 0, 1, -1};
        int[] mv2 = {1, -1, 0, 0};
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            if(poll[0]==-1){
                q.add(new int[]{-1,-1});
                if(q.size()==1) return;
                answer++;
                continue;
            }
            for (int i = 0; i < mv1.length; i++) {
                int nx = poll[0] + mv1[i];
                int ny = poll[1] + mv2[i];
                if (nx >= 1 && nx <= n && ny >= 1 && ny <= m) {
                    if (!visit[nx][ny] && map[nx][ny] == 0) {
                        visit[nx][ny] = true;
                        map[nx][ny]=1;
                        q.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }

}