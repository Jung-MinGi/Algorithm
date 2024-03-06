import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr = new int[10];
    static int[] cookie = new int[10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Arrays.fill(arr, 1);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int price = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int idx = 9;
        while (idx >= 0) {
            int tmp = (int) Math.pow(2, idx);
            if (tmp <= m) {
                cookie[idx] = 1;
                m -= tmp;
            }
            if (price >= tmp) {
                price -= tmp;
            }
            idx--;
        }
        if (price == 0) {
            System.out.println("No thanks");
            return;
        }
        idx=0;
        for (int i : cookie) {
            if (i != 0) {
                int tmp = (int) Math.pow(2, idx);
                if (tmp <= price) price -= tmp;
            }
            idx++;
        }
        System.out.println(price == 0 ? "Thanks" : "Impossible");
    }
}


