import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;


class Main {
    static int n, m;
    static Integer[][] arr;
    static Integer[] dp;
    static boolean[] visit;

    static int max = -1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new Integer[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        soultion(0, 0);
        System.out.println(max);
    }


    static void soultion(int idx, int sum) {
        for (int i = idx; i < n; i++) {
            soultion(i + arr[i][0], sum + arr[i][1]);
        }
        if (idx > n) return;
        max = Math.max(max, sum);
    }
}
