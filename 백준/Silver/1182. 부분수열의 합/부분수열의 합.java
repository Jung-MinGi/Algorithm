import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static boolean[] visit;
    static int[] dp;
    static StringTokenizer st;
    static int s;
    static int n;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        arr = new int[n + 1];
        visit = new boolean[n + 1];
        dp = new int[n];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            soultion(i, 1, 0);
        }
        System.out.println(answer);

    }

    static void soultion(int a, int idx, int depth) {
        if (depth == a) {
            int sum = 0;
            for (int i : dp) {
                sum += i;
            }
            if (sum == s) answer++;
            return;
        }
        for (int i = idx; i <= n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                dp[depth] = arr[i];
                soultion(a, i + 1, depth + 1);
                visit[i] = false;
            }
        }
    }
}