import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, m, k, w;
    static int[][] arr;
    static int[][] B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        arr = new int[m][n];
        B = new int[m - w + 1][n - w + 1];
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] = getMedian(i, j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int[] ints : B) {
            for (int anInt : ints) {
                sb.append(anInt).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }

    static int getMedian(int a, int b) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = a; i < a + w; i++) {
            for (int j = b; j < b + w; j++) {
                list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(list.size() / 2);
    }
}


