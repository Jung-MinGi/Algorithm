import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n, m;
    static int cnt = 0;
    static int[][] arr;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j) == '|' ? 1 : 0;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visit[i][j]) {
                    if (arr[i][j] == 0) {
                        rowSearch(i, j);
                    } else {
                        colSearch(i, j);
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    static void rowSearch(int x, int y) {
        int comp = arr[x][y];
        visit[x][y] = true;
        for (int i = y + 1; i < m; i++) {
            if (comp != arr[x][i]) break;
            visit[x][i] = true;
        }
        cnt++;
    }

    static void colSearch(int x, int y) {
        int comp = arr[x][y];
        visit[x][y] = true;
        for (int i = x + 1; i < n; i++) {
            if (comp != arr[i][y]) break;
            visit[i][y] = true;
        }
        cnt++;
    }
}