import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            int max = -1;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                int a = arr[j][i];
                if (max < a) {
                    max = a;
                    cnt++;
                }
            }
            System.out.print(cnt + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            int max = -1;
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                int a = arr[i][j];
                if (max < a) {
                    max = a;
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }


}
