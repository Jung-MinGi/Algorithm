import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    static char[][] a;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        a = new char[n * 2][m * 2];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                a[i][j] = s.charAt(j);
                a[i][a[i].length - j - 1] = a[i][j];
            }
        }

        for (int i = 0; i < m*2; i++) {
            for (int j = n; j < n*2; j++) {
                a[j][i]=a[2*n-j-1][i];
            }
        }
//        int x = n;
//        int y = 0;
//        for (int i = x; i < n + x; i++) {
//            for (int j = y; j < y + m; j++) {
//                a[i][j] = a[j][i];
//            }
//        }
//        x = n;
//        y = m;
//        for (int i = x; i < n + x; i++) {
//            for (int j = y; j < y + m; j++) {
//                a[i][j] = a[i % n][j % m];
//            }
//        }
        st = new StringTokenizer(br.readLine());
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        a[i-1][j-1] = a[i-1][j-1] == '.' ? '#' : '.';
       StringBuilder sb = new StringBuilder();
        for (char[] chars : a) {
            for (char aChar : chars) {
                sb.append(aChar);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
