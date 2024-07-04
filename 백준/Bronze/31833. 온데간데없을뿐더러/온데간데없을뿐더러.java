import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) sb.append(st.nextToken());
        Long x = Long.parseLong(sb.toString());
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        while (st.hasMoreTokens()) sb.append(st.nextToken());
        Long y = Long.parseLong(sb.toString());
        if (x > y) {
            System.out.println(y);
        } else System.out.println(x);
    }
}