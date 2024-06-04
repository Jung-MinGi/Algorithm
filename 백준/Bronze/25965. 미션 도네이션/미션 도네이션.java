import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            long answer = 0;
            int n = Integer.parseInt(br.readLine());
            int[][] a = new int[n][3];
            StringTokenizer st;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                a[i][0] = Integer.parseInt(st.nextToken());
                a[i][1] = Integer.parseInt(st.nextToken());
                a[i][2] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            int kill = Integer.parseInt(st.nextToken());
            int death = Integer.parseInt(st.nextToken());
            int assist = Integer.parseInt(st.nextToken());
            for (int[] ints : a) {
                long tmp = (long) kill * ints[0] - ((long) death * ints[1]) + (long) ints[2] * assist;
                if (tmp > 0) answer += tmp;
            }
            System.out.println(answer);
        }
    }
}
