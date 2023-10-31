import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n, m;
    static int[][] arr;
    static boolean[][] visit;
    static int answer = Integer.MIN_VALUE;
    static ArrayList<int[]> list = new ArrayList<>();
    static int[][] dp = new int[3][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] == 2) list.add(new int[]{i, j});
            }
        }
        soultion(0,  0);
        System.out.println(answer);
    }

    static int infection() {
        int[][] tmp = new int[n][m];
        boolean[][] visitTmp = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tmp[i][j] = arr[i][j];
                visitTmp[i][j] = visit[i][j];
            }
        }
        Queue<int[]> q = new LinkedList<>();
        int[] mx = new int[]{1, -1, 0, 0};
        int[] my = new int[]{0, 0, 1, -1};
        for (int[] ints : list) {
            q.add(new int[]{ints[0], ints[1]});
            visitTmp[ints[0]][ints[1]] = true;
        }
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + mx[i];
                int ny = poll[1] + my[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (tmp[nx][ny] == 1) continue;
                if (visitTmp[nx][ny]) continue;
                tmp[nx][ny] = 2;
                visitTmp[nx][ny] = true;
                q.add(new int[]{nx, ny});
            }
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tmp[i][j] == 0) {
                    cnt++;
                }
            }
        }
        return cnt;

    }

    static void soultion(int x, int depth) {
        if (depth == 3) {
            answer = Math.max(infection(), answer);
//            for (int[] ints : dp) {
//                System.out.print(ints[0]+" "+ints[1]+" ");
//            }
//            System.out.println();
            return;
        }

        for (int i = x; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    arr[i][j] = 1;
                    dp[depth]=new int[]{i,j};
                    soultion(i, depth + 1);
                    arr[i][j] = 0;
                }
            }
        }
    }
}