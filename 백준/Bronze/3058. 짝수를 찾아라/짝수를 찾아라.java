import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            int min = Integer.MAX_VALUE;
            while (st.hasMoreTokens()) {
                int i = Integer.parseInt(st.nextToken());
                if (i % 2 == 0) {
                    sum += i;
                    if (min > i) {
                        min = i;
                    }
                }
            }
            System.out.println(sum + " " + min);
        }
    
    }
}
