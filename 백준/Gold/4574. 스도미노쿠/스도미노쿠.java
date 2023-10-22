import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int[][] arr ;
    static boolean[][] domino;
    static boolean flag;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt=0;
        while (true) {
            flag = false;
            domino = new boolean[10][10];
            arr= new int[9][9];
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                String str1 = st.nextToken();
                int y = Integer.parseInt(st.nextToken());
                String str2 = st.nextToken();

                domino[x][y] = true;
                domino[y][x] = true;

                arr[str1.charAt(0) - 'A'][str1.charAt(1) - '1'] = x;
                arr[str2.charAt(0) - 'A'][str2.charAt(1) - '1'] = y;
            }
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i < 10; i++) {
                String s = st.nextToken();
                arr[s.charAt(0) - 'A'][s.charAt(1) - '1'] = i;
            }
            sb.append("Puzzle ").append(++cnt).append('\n');
            soultion(0);

        }
        System.out.println(sb);
    }

    static void soultion(int idx) {
        if (flag) return;

        if (idx == 81) {
            flag = true;
            for (int[] ints : arr) {
                for (int anInt : ints) {
                    sb.append(anInt);
                }
                sb.append('\n');
            }
            return;
        }
        int row = idx/9;
        int col = idx%9;
        if (arr[row][col] != 0) {
            soultion(idx + 1);
            return;
        }
            int[] mx = new int[]{0, 1};
            int[] my = new int[]{1, 0};
            for (int i = 0; i < 2; i++) {
                int nx = mx[i] + row;
                int ny = my[i] + col;
                if (nx < 0 || nx >= 9 || ny < 0 || ny >= 9 || arr[nx][ny] != 0) continue;

                for (int j = 1; j < 10; j++) {
                    for (int k = 1; k < 10; k++) {
                        if (j == k || domino[j][k] || !check(row, col, j) || !check(nx, ny, k)) continue;
                        arr[row][col] = j;
                        arr[nx][ny] = k;
                        domino[j][k] = true;
                        domino[k][j] = true;
                        soultion(idx+ 1);
                        arr[row][col] = 0;
                        arr[nx][ny] = 0;
                        domino[j][k] = false;
                        domino[k][j] = false;
                    }
                }

        }
    }

    static boolean check(int x, int y, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[x][i] == val)
                return false;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][y] == val)
                return false;
        }

        int row = x / 3 * 3;
        int col = y / 3 * 3;
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (arr[i][j] == val) return false;
            }
        }
        return true;
    }
}