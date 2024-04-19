import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] sx = {-1, 1, 1, -1};
    static int[] sy = {1, 1, -1, -1};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            char[][] arr = new char[5][5];
            for (int i = 0; i < 5; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String s = st.nextToken();
                for (int j = 0; j < s.length(); j++) {
                    arr[i][j] = s.charAt(j);
                }
            }
            boolean a = false;
            boolean b = false;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (!a && arr[i][j] == 'A') {
                        if (bfs(arr, dx, dy, i, j) || bfs(arr, sx, sy, i, j)) {
                            a = true;
                        }

                    }
                    if (!b && arr[i][j] == 'B') {
                        if (bfs(arr, dx, dy, i, j) || bfs(arr, sx, sy, i, j)) {
                            b = true;
                        }
                    }
                }
            }
            if (a && b || !a && !b) System.out.println("draw");
            else if (!b) System.out.println("A wins");
            else System.out.println("B wins");
        }

    }

    static boolean bfs(char[][] arr, int[] x, int[] y, int a, int b) {

        char target = arr[a][b];

        for (int i = 0; i < 4; i++) {
            int currentX = a;
            int currentY = b;
            int ret = 1;
            for (int j = 0; j < 2; j++) {
                int nx = x[i] + currentX;
                int ny = y[i] + currentY;
                if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5 || arr[nx][ny] != target) continue;

                currentX = nx;
                currentY = ny;
                ret++;
            }
            if (ret == 3) return true;
        }
        return false;
    }
}
