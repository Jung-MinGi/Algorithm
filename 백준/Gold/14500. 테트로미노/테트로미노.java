import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n, m;
    static Integer[][] arr;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new Integer[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                search(i, j);
            }
        }
        System.out.println(max);
    }

    static void search(int x, int y) {
        //막대기모양
        if (y - 3 > 0) {//왼쪽 막대기 탐색
            int sum = 0;
            for (int i = y; i >= y - 3; i--) {
                sum += arr[x][i];
            }
            max = Math.max(max, sum);
        }
        if (y + 3 <= m) {//오른쪽 막대기 탐색
            int sum = 0;
            for (int i = y; i <= y + 3; i++) {
                sum += arr[x][i];
            }
            max = Math.max(max, sum);
        }
        if (x - 3 > 0) {//위 막대기 탐색
            int sum = 0;
            for (int i = x; i >= x - 3; i--) {
                sum += arr[i][y];
            }
            max = Math.max(max, sum);
        }
        if (x + 3<= n) {//아래 막대기 탐색
            int sum = 0;
            for (int i = x; i <= x + 3; i++) {
                sum += arr[i][y];
            }
            max = Math.max(max, sum);
        }
        //네모
        if (y + 1 <= m && x + 1 <= n) {
            int sum = arr[x][y] + arr[x + 1][y] + arr[x + 1][y + 1] + arr[x][y + 1];
            max = Math.max(max, sum);
        }
        if (x + 1 <= n && y - 1 > 0) {
            int sum = arr[x][y] + arr[x + 1][y] + arr[x + 1][y - 1] + arr[x][y - 1];
            max = Math.max(max, sum);
        }
        if (x - 1 > 0 && y - 1 > 0) {
            int sum = arr[x][y] + arr[x][y - 1] + arr[x - 1][y] + arr[x - 1][y - 1];
            max = Math.max(max, sum);
        }
        if (x - 1 > 0 && y + 1 <= m) {
            int sum = arr[x][y] + arr[x][y + 1] + arr[x - 1][y] + arr[x - 1][y + 1];
            max = Math.max(max, sum);
        }
        //ㄱ모양
        if (y - 2 > 0 && x + 1 <= n) {//왼쪽 ㄱ 탐색
            int sum = 0;
            for (int i = y; i >= y - 2; i--) {
                sum += arr[x][i];
            }
            sum += arr[x + 1][y - 2];
            max = Math.max(max, sum);
            sum = arr[x][y] + arr[x][y - 1] + arr[x + 1][y - 1] + arr[x + 1][y - 2];
            max = Math.max(max, sum);
        }
        if (y - 2 > 0 && x - 1 >= 1) {//왼쪽 ㄱ 탐색
            int sum = 0;
            for (int i = y; i >= y - 2; i--) {
                sum += arr[x][i];
            }
            sum += arr[x - 1][y - 2];
            max = Math.max(max, sum);

        }
        if (y + 2 <= m && x + 1 <= n) {//오른쪽 ㄱ 탐색
            int sum = 0;
            for (int i = y; i <= y + 2; i++) {
                sum += arr[x][i];
            }
            sum += arr[x + 1][y + 2];
            max = Math.max(max, sum);
            sum = arr[x][y] + arr[x][y + 1] + arr[x + 1][y + 1] + arr[x + 1][y + 2];
            max = Math.max(max, sum);
        }
        if (y + 2 <= m && x - 1 >= 1) {//오른쪽 ㄱ 탐색
            int sum = 0;
            for (int i = y; i <= y + 2; i++) {
                sum += arr[x][i];
            }
            sum += arr[x - 1][y + 2];
            max = Math.max(max, sum);
        }
        if (x - 2 > 0 && y - 1 > 0) {//위 막대기 탐색
            int sum = 0;
            for (int i = x; i >= x - 2; i--) {
                sum += arr[i][y];
            }
            sum += arr[x - 2][y - 1];
            max = Math.max(max, sum);
            sum = arr[x][y] + arr[x - 1][y] + arr[x - 1][y - 1] + arr[x - 2][y - 1];
            max = Math.max(max, sum);
        }
        if (x + 2 <= n && y - 1 > 0) {//위 막대기 탐색
            int sum = 0;
            for (int i = x; i <=x+2; i++) {
                sum += arr[i][y];
            }
            sum += arr[x + 2][y - 1];
            max = Math.max(max, sum);
            sum = arr[x][y] + arr[x + 1][y] + arr[x + 1][y - 1] + arr[x + 2][y - 1];
            max = Math.max(max, sum);
        }
        if (x + 2 <= n && y + 1 <= m) {//위 막대기 탐색
            int sum = 0;
            for (int i = x; i <=x+2; i++) {
                sum += arr[i][y];
            }
            sum += arr[x + 2][y + 1];
            max = Math.max(max, sum);
            sum = arr[x][y] + arr[x + 1][y] + arr[x + 1][y + 1] + arr[x + 2][y + 1];
            max = Math.max(max, sum);
        }
        if (x - 2 > 0 && y + 1 <= m) {//위 막대기 탐색
            int sum = 0;
            for (int i = x; i >= x - 2; i--) {
                sum += arr[i][y];
            }
            sum += arr[x - 2][y + 1];
            max = Math.max(max, sum);
            sum = arr[x][y] + arr[x - 1][y] + arr[x - 1][y + 1] + arr[x - 2][y + 1];
            max = Math.max(max, sum);
        }
        if (y - 2 > 0) {
            if (x - 1 > 0) {
                int sum = 0;
                for (int i = y; i >= y - 2; i--) {
                    sum += arr[x][i];
                }
                sum += arr[x - 1][y - 1];
                max = Math.max(max, sum);
            }
            if (x + 1 <= n) {
                int sum = 0;
                for (int i = y; i >= y - 2; i--) {
                    sum += arr[x][i];
                }
                sum += arr[x + 1][y - 1];
                max = Math.max(max, sum);
            }
        }
        //
        if (y + 2 <= m) {
            if (x - 1 > 0) {
                int sum = 0;
                for (int i = y; i <= y + 2; i++) {
                    sum += arr[x][i];
                }
                sum += arr[x - 1][y + 1];
                max = Math.max(max, sum);
            }
            if (x + 1 <= n) {
                int sum = 0;
                for (int i = y; i <= y + 2; i++) {
                    sum += arr[x][i];
                }
                sum += arr[x + 1][y + 1];
                max = Math.max(max, sum);
            }
        }
        if (x - 2 > 0) {
            if (y - 1 > 0) {
                int sum = 0;
                for (int i = x; i <= x - 2; i--) {
                    sum += arr[i][y];
                }
                sum += arr[x - 1][y - 1];
                max = Math.max(max, sum);
            }
            if (y + 1 <= m) {
                int sum = 0;
                for (int i = x; i >=x - 2; i--) {
                    sum += arr[i][y];
                }
                sum += arr[x - 1][y + 1];
                max = Math.max(max, sum);
            }
        }
        //
        if(x+2<=n){
            if (y - 1 > 0) {
                int sum = 0;
                for(int i=x; i<=x+2; i++){
                    sum+=arr[i][y];
                }
                sum+=arr[x+1][y-1];
                max = Math.max(max, sum);
            }
            if (y + 1 <= m) {
                int sum = 0;
                for(int i=x; i<=x+2; i++){
                    sum+=arr[i][y];
                }
                sum+=arr[x+1][y+1];
                max = Math.max(max, sum);
            }
        }
    }
}
