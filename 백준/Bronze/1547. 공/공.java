import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr = new int[3];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int a = 0;
            int b = 0;
            for (int i = 0; i < 3; i++) {
                if (arr[i] == x) a = i;
                if (arr[i] == y) b = i;
            }
            swap(a, b);
        }
        System.out.println(arr[0]);
    }

    static void swap(int a, int b) {

        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
