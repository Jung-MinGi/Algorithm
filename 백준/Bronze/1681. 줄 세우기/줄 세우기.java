import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int idx = 1;
        while (n != 0) {
            if (!String.valueOf(idx).contains(k + "")) {
                n--;
            }
            idx++;
        }
        System.out.println(idx - 1);
    }
}

