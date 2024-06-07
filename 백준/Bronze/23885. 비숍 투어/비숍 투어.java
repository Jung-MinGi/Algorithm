import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int end = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        if (start % 2 == 0 && end % 2 == 0) {
            System.out.println("YES");
        } else if (start % 2 == 1 && end % 2 == 1) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
