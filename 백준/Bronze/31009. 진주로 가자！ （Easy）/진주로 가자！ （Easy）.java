import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    // 00 10 01 11
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            if (st.nextToken().equals("jinju")) {
                a[i] = Integer.parseInt(st.nextToken());
                x = a[i];

            } else {
                a[i] = Integer.parseInt(st.nextToken());
            }
        }
        int cnt = 0;
        for (int i : a) {
            if (i > x) cnt++;
        }
        System.out.println(x);
        System.out.println(cnt);

    }
}
