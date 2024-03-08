import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long[] a;
    static long[] b;
    static long cost = 0;
    static long box = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        a = new long[n];
        b = new long[m];
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(br.readLine());
        }
        for (int i = 0; i < m; i++) {
            b[i] = Long.parseLong(br.readLine());
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                for (int j = 0; j < m; j++) {
                    if (b[j] > 0) {
                        getCost(i, j);
                    }
                }
            }
        }
        System.out.println(box + " " + cost);
    }

    static void getCost(int i, int j) {
        if (a[i] > b[j]) {
            cost += (i + j + 2) * b[j];
            box += b[j];
            a[i] -= b[j];
            b[j] = 0;
        } else if (a[i] < b[j]) {
            cost += (i + j + 2) * a[i];
            box += a[i];
            b[j] -= a[i];
            a[i] = 0;
        } else {
            cost += (i + j + 2) * b[j];
            box += b[j];
            a[i] = 0;
            b[j] = 0;
        }
    }
}


