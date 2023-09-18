import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static Character[][] arr;
    static boolean[][] visit;
    static int[] dp;
    static StringTokenizer st;
    static int m;
    static int n;
    static int aa;
    static int bb;
    static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new Character[n][m];
       // visit = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
               visit = new boolean[n][m];
                aa = i;
                bb = j;
                if (dfs(i, j, 1)) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }


    static boolean dfs(int x, int y, int cnt) {
        visit[x][y] = true;
        int[] u = new int[]{0, 1, 0, -1};
        int[] d = new int[]{1, 0, -1, 0};
        for (int i = 0; i < 4; i++) {
            int nextX = x + u[i];
            int nextY = y + d[i];
            if (nextX >= 0 && nextY >= 0 && nextY < m && nextX < n  && arr[x][y] == arr[nextX][nextY]) {
                if (!visit[nextX][nextY]) {
                    visit[nextX][nextY] = true;
                    if (dfs(nextX, nextY, cnt + 1)) {
                        return true;
                    }
                } else {
                    if (cnt >= 4 && nextX == aa && nextY == bb) return true;
                }
            }
        }
        return false;
    }
}