import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


class Main {
    static int n, m;
    static Integer[][] arr;
    static Integer[] dp;
    static boolean[] visit;

    static int max = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new Integer[n][m];
        visit = new boolean[26];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int k = 0; k < s.length(); k++) {
                arr[i][k] = s.charAt(k) - 'A';
            }
        }
        visit[arr[0][0]] = true;
        dfs(0, 0, 1);
        System.out.println(max);
    }


    static void dfs(int x, int y, int cnt) {
        int[] mx = new int[]{1, -1, 0, 0};
        int[] my = new int[]{0, 0, 1, -1};

        for (int i = 0; i < 4; i++) {
            int nx = x + mx[i];
            int ny = y + my[i];
            if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
            if (!visit[arr[nx][ny]]) {
                visit[arr[nx][ny]] = true;
                dfs(nx, ny, cnt + 1);
                visit[arr[nx][ny]] = false;
            }
        }
        max = Math.max(max, cnt);
    }
}
