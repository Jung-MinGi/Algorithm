import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class Main {
    static Integer[][] arr;
    static ArrayList<int[]> dp = new ArrayList<>();
    static boolean[][] visit;
    static int n, m;
    static boolean flag = false;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Integer[n][n];
        visit = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        int cnt = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != 0 && !visit[i][j]) {
                    cnt++;
                    bfs(i, j);
                    answer.add(dp.size());
                    dp = new ArrayList<>();
                }
            }
        }
        System.out.println(cnt);
        Stream<Integer> stream = answer.stream();
        stream.sorted().forEach(System.out::println);
    }

    static void bfs(int x, int y) {
        int[] mv1 = new int[]{1, -1, 0, 0};
        int[] mv2 = new int[]{0, 0, 1, -1};
        Queue<int[]> q = new LinkedList<>();
        visit[x][y] = true;
        q.add(new int[]{x, y});
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            dp.add(poll);
            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + mv1[i];
                int ny = poll[1] + mv2[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if (arr[nx][ny] == 1 && !visit[nx][ny]) {
                        q.add(new int[]{nx, ny});
                        visit[nx][ny] = true;
                    }
                }
            }
        }
    }
}