import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int cnt = 0;
        arr = new int[y + 1];
        while (x-- > 0) {
            int a = Integer.parseInt(br.readLine());
            for (int i = a; i <= y; i += a) {
                if (arr[i] != 1) {
                    arr[i] = 1;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
