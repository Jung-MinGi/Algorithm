import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        floyd_warshall();
        StringBuilder sb = new StringBuilder();
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sb.append(anInt).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static void floyd_warshall() {
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length; k++) {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[k][i] == 1 && arr[i][j] == 1) {
                        arr[k][j] = 1;
                    }
                }
            }
        }
    }
}