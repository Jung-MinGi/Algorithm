import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static Character[][] arr;
    static ArrayList<int[]> water = new ArrayList<>();

    static int n, m;
    static int k, h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new Character[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char[] charArray = s.toCharArray();
            for (int j = 0; j < m; j++) {
                char c = charArray[j];
                if (c == '*') {
                    water.add(new int[]{i, j});
                } else if(c=='S'){
                    k = i;
                    h = j;
                }
                arr[i][j] = c;
            }
        }
        bfs(k,h);
    }

    static void bfs(int x, int y) {//물이 있는 칸을 먼저 탐색 시행
        int[] mx = new int[]{1, -1, 0, 0};
        int[] my = new int[]{0, 0, -1, 1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y, 0});
        for (int[] ints : water) {
            q.add(new int[]{ints[0], ints[1]});
        }

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int a = poll[0];
            int b = poll[1];
            if(arr[a][b]=='*' && poll.length==3) continue;
            //여기부터 해야됨
            for (int i = 0; i < mx.length; i++) {
                int nx = a + mx[i];
                int ny = b + my[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (arr[a][b] == '*') {
                    if (arr[nx][ny] != 'D' && arr[nx][ny] != 'X' && arr[nx][ny]!='*') {
                        arr[nx][ny] = '*';
                        q.add(new int[]{nx, ny});
                    }
                }
                if (arr[a][b] == 'S') {
                    if (arr[nx][ny] != '*' && arr[nx][ny] != 'X' && arr[nx][ny]!='S') {
                        if(arr[nx][ny]=='D'){
                            System.out.println(poll[2]+1);
                            return;
                        }
                        arr[nx][ny] = 'S';
                        q.add(new int[]{nx, ny, poll[2] + 1});
                    }
                }
            }
        }
        System.out.println("KAKTUS");
    }
}
