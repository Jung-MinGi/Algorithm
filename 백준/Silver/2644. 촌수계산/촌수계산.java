import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());
        arr = new int[n + 1][n + 1];
        visit = new boolean[n + 1];
        while (k-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }
        bfs(start, end);
    }

    static void bfs(int start, int end) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start, 0});
        boolean flag = false;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            if (poll[0] == end) {
                flag = true;
                System.out.println(poll[1]);
                break;
            }
            visit[poll[0]] = true;
            for (int i = 1; i < arr.length; i++) {
                if (arr[poll[0]][i] == 1) {
                    if (visit[i]) continue;
                    int tmp = poll[1] + 1;
                    q.add(new int[]{i,tmp });
                    visit[i] = true;
                }
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
}
