import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans = Math.max(ans, getDay(i, a));
        }
        System.out.println(ans);
    }

    private static int getDay(int idx, int[] a) {
        int x = idx;//스트릭
        int day = 0;
        for (int i = idx; i < a.length; i++) {
            if (a[i] != 0) {
                day++;
            } else {
                if (x <= i) {
                    x = i + 2;
                } else break;
            }
        }
        return day;
    }
}

