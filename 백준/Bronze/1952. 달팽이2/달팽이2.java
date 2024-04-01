import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] arr;

   
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new boolean[n][m];

        int cnt = 0;
        arr[0][0] = true;
        int idx = 0;
        int x = 0;
        int y = 0;
        int[] dx = new int[]{0, 1, 0, -1};
        int[] dy = new int[]{1, 0, -1, 0};

        while (true) {
            boolean flag = true;
            int nx = dx[idx] + x;
            int ny = dy[idx] + y;
            while (nx >= 0 && ny >= 0 && nx < n && ny < m && !arr[nx][ny]) {
                arr[nx][ny] = true;
                x = nx;
                y = ny;
                nx = dx[idx] + x;
                ny = dy[idx] + y;
            }
            for (int i = 0; i < 4; i++) {
                int a = dx[i] + x;
                int b = dy[i] + y;
                if (a < 0 || b < 0 || a >= n || b >= m) continue;
                if (!arr[a][b]) {
                    flag = false;
                    break;
                }
            }
            if (flag) break;
            idx++;
            if (idx == 4) idx = 0;
            cnt++;
        }
        System.out.println(cnt);
    }
}

