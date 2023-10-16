import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    static int n;
    static Integer[][] arr;
    static ArrayList<Integer> list = new ArrayList<>();
    static boolean[][] visit;
    static int max = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(!list.contains(arr[i][j])) list.add(arr[i][j]);
            }
        }

        for (Integer a : list) {
            visit = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] <= a) visit[i][j] = true;
                }
            }
            int cnt=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visit[i][j]) {
                        bfs(i, j);
                        cnt++;
                    }
                }
            }
            max=Math.max(cnt,max);
        }
        System.out.println(max);
    }


    static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        int[] r = new int[]{1, -1, 0, 0};
        int[] c = new int[]{0, 0, 1, -1};
        q.add(new int[]{x, y});
        visit[x][y] = true;
        while(!q.isEmpty()){
            int[] poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + r[i];
                int ny = poll[1] + c[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if (visit[nx][ny]) continue;
                visit[nx][ny] = true;
                q.add(new int[]{nx, ny});
            }
        }
    }
}
