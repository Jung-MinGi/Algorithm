import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static Integer[][] arr = new Integer[9][9];
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfsBackTracking(0, 0);

    }

    static boolean check(int x, int y, int num) {
        //row check
        for (int i = 0; i < 9; i++) {
            if (arr[x][i] == num) return false;
        }
        //col check
        for (int i = 0; i < 9; i++) {
            if (arr[i][y] == num) return false;
        }
        //square check
        int a = (x / 3) * 3;
        int b = (y / 3) * 3;
        for (int i = a; i < a + 3; i++) {
            for (int j = b; j < b + 3; j++) {
                if (arr[i][j] == num) return false;
            }
        }
        return true;
    }

    static void dfsBackTracking(int row, int col) {
        if (col > 8) {
            dfsBackTracking(row + 1, 0);
            return;
        }
        if (row == 9) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.println(sb);
            System.exit(0);
        }

        if (arr[row][col] == 0) {
            for (int i = 1; i < 10; i++) {
                if (check(row, col, i)) {
                    arr[row][col] = i;
                    dfsBackTracking(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }
        dfsBackTracking(row, col + 1);
    }
}