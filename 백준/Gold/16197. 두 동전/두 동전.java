import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Main {
    static int n, m;
    static Character[][] arr;
    static int min = Integer.MAX_VALUE;
    static boolean flag=false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        arr = new Character[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.charAt(j);
                if (arr[i][j] == 'o') {
                    list.add(i);
                    list.add(j);
                }
            }
        }
        bfs(list.get(0), list.get(1), list.get(2), list.get(3));
        if (flag) {
            System.out.println(min);
        }
        else System.out.println(-1);
    }
    static void bfs(int x, int y, int x1, int y1) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y, x1, y1, 0});
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int[] r = new int[]{1, -1, 0, 0};
            int[] c = new int[]{0, 0, 1, -1};
            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + r[i];
                int ny = poll[1] + c[i];
                int nx1 = poll[2] + r[i];
                int ny1 = poll[3] + c[i];
                if (poll[4]+1 > 10) break;
                //동전 동시에 벗어나는 경우
                if ((nx < 0 || nx >= n || ny < 0 || ny >= m) && (nx1 < 0 || nx1 >= n || ny1 < 0 || ny1 >= m))
                    continue;
                //하나만 벗어나는 경우
                if((nx < 0 || nx >= n || ny < 0 || ny >= m)&&((nx1>=0||nx1<n)&&(ny1>=0||ny1<m))){
                    min = Math.min(min, poll[4]+ 1) ;
                    flag=true;
                    return;
                }
                if(((nx>=0||nx<n)&&(ny>=0||ny<m))&&(nx1 < 0 || nx1 >= n || ny1 < 0 || ny1 >= m)){
                    min = Math.min(min, poll[4]+ 1);
                    flag=true;
                    return;
                }
                //둘다 벽에 막히는 경우
                if (arr[nx][ny] == '#' && arr[nx1][ny1] == '#') continue;

                //벽에 막히지 않고 적어도 하나가 움직이는 경우
                if (arr[nx][ny] == '#' && (arr[nx1][ny1] == 'o' || arr[nx1][ny1] == '.')) {
                    int a = poll[4] + 1;
                    if(nx1==poll[0]&&ny1==poll[1])continue;
                    q.add(new int[]{x, y, nx1, ny1, a});
                    continue;
                }
                if ((arr[nx][ny] == '.' || arr[nx][ny] == 'o') && arr[nx1][ny1] == '#') {
                    int a = poll[4] + 1;
                    if(nx==poll[2]&&ny==poll[3])continue;
                    q.add(new int[]{nx, ny, x1, y1, a});
                    continue;
                }
                //둘다 움직이는 경우
                if ((arr[nx][ny] == '.' || arr[nx][ny] == 'o') && (arr[nx1][ny1] == 'o' || arr[nx1][ny1] == '.')) {
                    int a = poll[4] + 1;
                    q.add(new int[]{nx, ny, nx1, ny1, a});
                }
            }
        }
    }
}