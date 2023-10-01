import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static Integer[][] map = new Integer[0][0];
    static boolean[][] visit = new boolean[0][0];
    static StringTokenizer st;
    static int n;
    static int min = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new Integer[n][n];
        visit = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j] && map[i][j] != 0) {
                    bfs(i, j, cnt);
                    cnt += 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] != 0) {
                    soultion(i, j, map[i][j], map);
                }
            }
        }
        System.out.println(min);
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(map[i][j]);
//            }
//            System.out.println();
//        }
    }

    static void soultion(int x, int y, int num, Integer[][] tempArr) {
        int[] m1 = {1, -1, 0, 0};
        int[] m2 = {0, 0, 1, -1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});

        Integer[][] temp = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            temp[i] = Arrays.copyOf(tempArr[i], n);
        }
//        boolean[][] visit = new boolean[n][n];
//        for (int i = 0; i < n; i++) {
//            visit[i] = Arrays.copyOf(tempVisit[i], n);
//        }
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + m1[i];
                int ny = poll[1] + m2[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (!visit[nx][ny] && temp[nx][ny] != num && temp[nx][ny] == 0) {
                        q.add(new int[]{nx, ny});
                        temp[nx][ny] = temp[poll[0]][poll[1]] + 1;
                    } else if (temp[nx][ny] != num && temp[nx][ny] != 0 && visit[nx][ny]) {
                        min = Math.min(min, temp[poll[0]][poll[1]] - num);
                        return;
                    }
                }
            }
        }
    }

    static void bfs(int x, int y, int num) {
        int[] m1 = {1, -1, 0, 0};
        int[] m2 = {0, 0, 1, -1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y});
        map[x][y] = num;
        visit[x][y] = true;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + m1[i];
                int ny = poll[1] + m2[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (!visit[nx][ny] && map[nx][ny] != 0) {
                        q.offer(new int[]{nx, ny});
                        visit[nx][ny] = true;
                        map[nx][ny] = num;
                    }
                }
            }
        }

    }
}
