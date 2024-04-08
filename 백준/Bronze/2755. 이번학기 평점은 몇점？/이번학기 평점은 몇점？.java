import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static double a = 4;
    private static double b = 3;
    private static double c = 2;
    private static double d = 1;
    private static double f = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int score = 0;
        double v=0;
        while (n-- > 0) {
            double tmp = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            int t = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            score += t;

            char q = s.charAt(0);
            tmp += q == 'A' ? a : q == 'B' ? b : q == 'C' ? c : q == 'D' ? d : f;
            if (q != 'F'){
                q = s.charAt(1);
                tmp += q == '+' ? 0.3 : q == '-' ? -0.3 : 0;
            }
            v+=(tmp*t);
        }
        double ans = v  / score;
        double answer = Math.round(ans * 100) / 100.0;
        System.out.printf("%.2f",answer);
    }
}
