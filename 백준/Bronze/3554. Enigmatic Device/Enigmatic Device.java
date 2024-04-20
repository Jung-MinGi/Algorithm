import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    private static final int MOD = 2010;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int ans = 0;
            int l = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (x == 1) {
                for (int i = l; i <= m; i++) {
                    a[i] = (a[i]*a[i]) % MOD;
                }
            } else {
                for (int i = l; i <= m; i++) {
                    ans += a[i];
                }
                sb.append(ans).append('\n');
            }
        }
        System.out.println(sb);

    }


}
