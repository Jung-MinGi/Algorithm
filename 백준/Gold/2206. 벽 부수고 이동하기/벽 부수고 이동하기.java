import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n, m;
    static int[][] arr;
    static boolean[][][] visit;
    static int answer = Integer.MAX_VALUE;
    static ArrayList<int[]> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visit = new boolean[n][m][2];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }
        visit[0][0][0] = true;
        visit[0][0][1] = false;
        BFS(0, 0);
        if (answer == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(answer);
    }

    static void BFS(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y, 0, 1});
        int[] mx = new int[]{1, -1, 0, 0};
        int[] my = new int[]{0, 0, 1, -1};
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int a = poll[0];
            int b = poll[1];
            if (a == n - 1 && b == m - 1) {
                answer = Math.min(answer, poll[3]);
                break;
            }
            for (int i = 0; i < 4; i++) {
                int nx = a + mx[i];
                int ny = b + my[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (arr[nx][ny] == 1) {
                    if(poll[2]!=1&&!visit[nx][ny][0]){
                        q.add(new int[]{nx,ny,poll[2]+1,poll[3]+1});
                        visit[nx][ny][0]=true;
                    }
                } else {
                    if(poll[2]==1&&!visit[nx][ny][1]){
                        q.add(new int[]{nx,ny,poll[2],poll[3]+1});
                        visit[nx][ny][1]=true;
                    }if(poll[2]==0&&!visit[nx][ny][0]){
                        q.add(new int[]{nx,ny,poll[2],poll[3]+1});
                        visit[nx][ny][0]=true;
                    }
                }
            }

        }
    }
}