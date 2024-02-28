import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int[][] arr;
    static int[] comp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        comp = new int[n + 1];
        arr = new int[n + 1][n + 1];
        for (int i = 1; i < arr.length; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j + 1] = (s.charAt(j) - '0' <= 9 ? s.charAt(j) - '0' : (s.charAt(j) - '@') * -1);
            }
        }
        backTracking(1, new int[n + 1], new boolean[n + 1]);
        System.out.println(min);
        System.out.println(max);
    }

    static void backTracking(int depth, int[] array, boolean[] visit) {
        if (depth == n + 1) {
            int ans = 1;
            for (int i = 1; i < array.length; i++) {
                ans *= arr[i][array[i]];
            }
            if (getCycleNum(array) % 2 == 0) ans *= -1;
            min = Math.min(ans, min);
            max = Math.max(ans, max);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                array[depth] = i;
                backTracking(depth + 1, array, visit);
                array[depth] = -1;
                visit[i] = false;
            }
        }
    }

    static int getCycleNum(int[] comp) {
        boolean[] visit = new boolean[comp.length + 1];
        int cnt = 0;
        for (int i = 1; i < comp.length; i++) {
            if (visit[i]) continue;
            if (comp[i] == i) {
                visit[i] = true;
                cnt++;
            } else {
                visit[i] = true;
                int next = comp[i];
                while (true) {
                    visit[next] = true;
                    next = comp[next];
                    if (visit[next]) break;
                }
                cnt++;
            }
        }
        return cnt;
    }
}
