import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] visit;
    static int[] population;
    static int[][] arr = new int[5][5];
    static int n;
    static HashSet<String> set = new HashSet<>();
    static int total = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soultion(i, j);
            }
        }
        System.out.println(set.size());

    }

    static void soultion(int x, int y) {
        int[] mx = new int[]{1, -1, 0, 0};
        int[] my = new int[]{0, 0, 1, -1};
        Queue<String[]> q = new LinkedList<>();
        q.add(new String[]{String.valueOf(x), String.valueOf(y), String.valueOf(arr[x][y])});
        while (!q.isEmpty()) {
            String[] poll = q.poll();
            String tmp = poll[2];
            if (tmp.length() == 6 && !set.contains(tmp)) {
                set.add(tmp);
                continue;
            }
            if(tmp.length()==6&&set.contains(tmp))continue;
            for (int i = 0; i < 4; i++) {
                int nx = mx[i] + Integer.parseInt(poll[0]);
                int ny = my[i] + Integer.parseInt(poll[1]);
                if (nx < 0 || ny < 0 || nx > 4 || ny > 4) continue;
                String s = poll[2] + arr[nx][ny];
                if(s.length()==6&&set.contains(s))continue;
                q.add(new String[]{String.valueOf(nx), String.valueOf(ny), s});
            }
        }

    }
}