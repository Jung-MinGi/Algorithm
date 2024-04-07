import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int max = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < a - 1; i++) {
            int start = arr[i];
            int end = arr[i];
            for (int j = i + 1; j < a; j++) {
                if (arr[j - 1] < arr[j]) end = arr[j];
                else break;
            }
            max = Math.max(max, end - start);
        }
        System.out.println(max);
    }
}
