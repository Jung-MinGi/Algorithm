import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int r, c, k,distance;
    static boolean flag;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = (s.charAt(j)=='.') ? 1 : -1;
            }
        }
        arr[0][c-1]=100;
        dfs(new boolean[r][c],r-1,0,1);
        System.out.println(distance);
    }

    static void dfs(boolean[][] visit, int x, int y, int cnt) {
        int[] nx = new int[]{1, -1, 0, 0};
        int[] ny = new int[]{0, 0, 1, -1};
        visit[x][y]=true;
        if (x == 0 && y == c - 1 && cnt == k) {
            distance++;
            return;
        }
        if(cnt>k||x == 0 && y == c - 1)return;
        for (int i = 0; i < 4; i++) {
            int nextX = nx[i] + x;
            int nextY = ny[i] + y;
            if (nextX < 0 || nextY < 0 || nextX >= r || nextY >= c) continue;
            if (arr[nextX][nextY]!=100&& visit[nextX][nextY]) continue;
            if (arr[nextX][nextY] == -1) continue;
            visit[nextX][nextY] = true;
            dfs(visit, nextX, nextY, cnt + 1);
            visit[nextX][nextY] = false;
        }
    }
}