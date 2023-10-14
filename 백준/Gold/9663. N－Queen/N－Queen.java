import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Main {
    static int n;
    static Integer[][] arr;
    static int[][] check;
    static ArrayList<Integer> dp;
    static boolean[] checkNum;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Integer[n][n];
        check = new int[n][n];
        dp = new ArrayList<>();
        checkNum = new boolean[n];
        backTracking(0, 0);
        System.out.println(count);
    }

    static void check(int x, int y) {
        check[x][y]++;
        int tmpX = x;
        int tmpY = y;
        while (true) {
            x++;
            y++;
            if(x >= n || y >= n)break;
            check[x][y]++;
        }
        while (true) {
            tmpX++;
            tmpY--;
            if(tmpX == n || tmpY < 0)break;
            check[tmpX][tmpY]++;
        }
    }

    static void checkFalse(int x, int y) {
        check[x][y]--;
        int tmpX = x;
        int tmpY = y;
        while (true) {
            x++;
            y++;
            if(x == n || y == n)break;
            check[x][y]--;
        }
        while (true) {
            tmpX++;
            tmpY--;
            if(tmpX == n || tmpY < 0)break;
            check[tmpX][tmpY]--;
        }
    }


    static void backTracking(int idx, int depth) {
        if (dp.size() == n) {
            count++;
            
            return;
        }
        for (int j = 0; j < n; j++) {
            if (check[idx][j] == 0 && !checkNum[j]) {
                checkNum[j] = true;
                dp.add(j);
                check(idx, j);
                backTracking(idx + 1, depth + 1);
                checkNum[j] = false;
                dp.remove(dp.size() - 1);
                checkFalse(idx, j);
            }
        }
    }
}
