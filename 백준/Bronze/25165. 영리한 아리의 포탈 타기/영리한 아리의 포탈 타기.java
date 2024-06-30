import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        map = new int[n][m];

        st = new StringTokenizer(br.readLine());
        int a = 0;
        int b = Integer.parseInt(st.nextToken()) - 1;
        int direction = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken())-1;
        int y = Integer.parseInt(st.nextToken())-1;


        for (int i = 0; i < n; i++) {
            while (true) {
                if(a==n-1&&b==m-1)break;
                if (a == x && b == y) {
                    System.out.println("NO...");
                    return;
                }
                if (direction == 0) {
                    b--;
                    if (b < 0) {
                        a++;
                        b = 0;
                        break;
                    }
                } else {
                    b++;
                    if (b >= m) {
                        a++;
                        b = m - 1;
                        break;
                    }
                }
               
            }
            direction = direction == 0 ? 1 : 0;
        }
        System.out.println("YES!");
    }
}
