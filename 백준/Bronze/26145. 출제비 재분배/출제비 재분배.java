import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[][] array = new int[a][a+b];
        for (int i = 0; i < a; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a+b; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < a + b; i++) {
            int tmp = 0;
            if (i < a) {
                int cost = 0;
                for (int j = 0; j < a+b; j++) {
                    cost += array[i][j];
                }
                tmp = arr[i] - cost;

            }
            for (int j = 0; j < a; j++) {
                tmp += array[j][i];
            }
            System.out.print(tmp + " ");
        }

    }
}
