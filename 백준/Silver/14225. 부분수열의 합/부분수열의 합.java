import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n, m;
    static Integer[] arr;
    static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max += arr[i];
        }
        visit = new boolean[max + 1];
        for (int i = 1; i <= n; i++) {
            backTracking(0, i, 0, 0);
        }
        for (int i = 1; i < visit.length; i++) {
            if (!visit[i]) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(max+1);

    }

    static void backTracking(int idx, int x, int depth, int sum) {
        if (depth == x) {
            visit[sum] = true;
            return;
        }
        for (int i = idx; i < n; i++) {
            backTracking(i + 1, x, depth + 1, sum + arr[i]);
        }
    }
}