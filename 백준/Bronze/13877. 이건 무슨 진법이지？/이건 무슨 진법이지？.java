import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = {8, 10, 16};
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            StringBuilder sb = new StringBuilder(st.nextToken()).reverse();
            int tmp = 0;
            System.out.print(a + " ");
            for (int j = 0; j < 3; j++) {
                solution(sb, tmp, array[j]);

            }
            System.out.println();
        }
    }

    private static void solution(StringBuilder sb, int tmp, int m) {
        boolean flag = false;
        for (int j = 0; j < sb.length(); j++) {
            int x = sb.charAt(j) - '0';
            if (x < m) {
                tmp += (int) (Math.pow(m, j) * x);
            } else {
                System.out.print(0 + " ");
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.print(tmp + " ");
        }
    }
}
