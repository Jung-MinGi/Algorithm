import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int stress = 0;
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int i = Integer.parseInt(st.nextToken());
            if (i >= 0) stress += i;
            else stress = Math.max(0, stress + i);
            if (stress >= m) cnt++;
        }
        System.out.println(cnt);
    }

}