import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            int[][] a = new int[n][2];
            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                if (i == 0) {
                    a[i] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
                } else {
                    a[i] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};
                }
            }
            int distance = a[0][0] * a[0][1];
            for (int i = 1; i < n; i++) {
                distance += a[i][0] * (a[i][1] - a[i - 1][1]);
            }
            System.out.println(distance + " miles");
        }
    }
}

