import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    static int album = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int cnt = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = i + 1; j < 3; j++) {
                    if (arr[i] != arr[j]) cnt++;
                }
            }
            int ret = 0;
            int tmp = Math.max(arr[0], Math.max(arr[1], arr[2]));
            if (cnt == 0) {
                ret = 10000 + tmp * 1000;
            } else if (cnt == 2) {
                ret = 1000 + tmp * 100;
            } else {
                ret = tmp * 100;

            }
            max = Math.max(max, ret);
        }
        System.out.println(max);
    }
}
