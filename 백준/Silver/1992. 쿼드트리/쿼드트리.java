import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n, m, k;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j)-'0';
            }
        }
        if (isPossible(n, 0, 0)) {
            System.out.println(arr[0][0]);
            return;
        }
        System.out.println(partition(new StringBuilder(), n, 0, 0));

    }

    static String partition(StringBuilder sb, int size, int x, int y) {

        if (size == 1) {
            return sb.append(arr[x][y]).toString();
        }
        if (isPossible(size, x, y)) {
            return sb.append(arr[x][y]).toString();
        }
        int newSize = size / 2;
        sb.append("(");
        partition(sb, newSize, x, y);
        partition(sb, newSize, x, y + newSize);
        partition(sb, newSize, x + newSize, y);
        partition(sb, newSize, x + newSize, y + newSize);
        sb.append(")");
        return sb.toString();
    }

    static boolean isPossible(int size, int x, int y) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != arr[x][y]) return false;
            }
        }
        return true;
    }
}