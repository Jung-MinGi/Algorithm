import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] visit = new int[8][8];
    static int[][] map = new int[8][8];
    static boolean flag = false;
    static int row = 8;
    static int col = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            String s = br.readLine();
            for (int j = 0; j < 8; j++) {
                if (s.charAt(j) == '.') {
                    map[i][j] = 0;
                } else {
                    map[i][j] = 1;
                    row = Math.min(row, i);
                    col = Math.max(col, j);
                }
            }
        }
        bfs();
        System.out.println((flag) ? 1 : 0);
    }

    static void bfs() {
        int[] mx = new int[]{1, 1, 1, -1, -1, -1, 1, 0, -1, 1, 0, -1, 0};
        int[] my = new int[]{1, 0, -1, 1, 0, -1, 1, 1, 1, -1, -1, -1, 0};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{7, 0});
        q.add(new int[]{-1, -1});
        visit[7][0]++;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int a = poll[0];
            int b = poll[1];

//            if(a==0&&b==7){
//                flag=true;
//                break;
//            }
            if (a == -1) {//벽 움직임
//                System.out.println("row = " + row);
//                System.out.println("col = " + col);
                if (q.isEmpty()) break;
                wallMove();
                visit = new int[8][8];
                q.add(new int[]{-1, -1});
                continue;
            }
            if (map[a][b] == 1) continue;
            if (a == 0 && b == 7) {
                flag = true;
                break;
            }
            for (int i = 0; i < mx.length; i++) {
                int nx = a + mx[i];
                int ny = b + my[i];
                if (nx < 0 || nx > 7 || ny < 0 || ny > 7) continue;
                if (map[nx][ny] == 1) continue;
                if (visit[nx][ny] <= 2) {
                    visit[nx][ny]++;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }

    static void wallMove() {
        row = 8;
        col = 0;
        for (int i = 0; i < 8; i++) {
            map[7][i] = 0;
        }
        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j < 8; j++) {
                if (map[i][j] == 1) {
                    map[i][j] = 0;
                    if (i + 1 > 7) continue;
                    map[i + 1][j] = 1;
                    row = Math.min(row, i + 1);
                    col = Math.max(col, j);
                }
            }
        }
    }
}
