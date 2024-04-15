import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};
    static boolean[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new boolean[n][m];
        int x = 0;
        int y = 0;
        int idx = 0;
        int answer = 0;//회전수
        arr[0][0]=true;
        while (true) {
            while (true) {
                int nx = x + dx[idx];
                int ny = y + dy[idx];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m||arr[nx][ny]) {
                    idx++;
                    if(idx==4)idx=0;
                    break;
                }
                arr[nx][ny] = true;
                x = nx;
                y = ny;
            }
            boolean flag = false;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[idx];
                int ny = y + dy[idx];
                if (nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
                if(!arr[nx][ny])flag=true;
            }
            if(!flag)break;
            answer++;
        }
        System.out.println(answer);
    }
}