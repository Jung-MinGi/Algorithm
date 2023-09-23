import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] map;
    static Integer[][] dp;
    static boolean[][] visit;
    static int answer = 0;
    static StringTokenizer st;
    static int n, m;
    static int[] target = new int[2];
    static Queue<int[]> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (testCase-- > 0) {
            n = Integer.parseInt(br.readLine());
            map = new int[n][n];
            visit = new boolean[n][n];
            q = new LinkedList<>();
            for (int i = 1; i <= 2; i++) {
                st = new StringTokenizer(br.readLine());
                if(i == 2) {
                    int a = Integer.parseInt(st.nextToken());
                    int b = Integer.parseInt(st.nextToken());
                    target[0] = a;
                    target[1] = b;
                }else{
                    int a = Integer.parseInt(st.nextToken());
                    int b = Integer.parseInt(st.nextToken());
                    visit[a][b] = true;
                    q.add(new int[]{a, b});
                }

            }
            for(int i=0; i<n; i++){
                Arrays.fill(map[i],1000);
            }
            int[] peek = q.peek();
            map[peek[0]][peek[1]]=1;
            if(peek[0]==target[0] && peek[1]==target[1]){
               sb.append(0).append('\n');
            }else{
                bfs();
                sb.append(map[target[0]][target[1]]-1).append('\n');
            }
        }
        System.out.println(sb);
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
        int[] mv1 = {2, -2, 2 ,-2, 1, -1, -1, 1};
        int[] mv2 = {1, -1, -1, 1, 2, -2, 2, -2};
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 0; i < mv1.length; i++) {
                int nx = poll[0] + mv1[i];
                int ny = poll[1] + mv2[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if(!visit[nx][ny]){
                        visit[nx][ny] = true;
                        map[nx][ny] =Math.min(map[nx][ny],map[poll[0]][poll[1]] + 1) ;
                        if (nx== target[0] && ny== target[1]) {
                            return;
                        }
                        q.add(new int[]{nx, ny});
                    }

                }
            }
        }
    }
}