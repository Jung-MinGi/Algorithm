import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c=='3'||c=='6'||c=='9')cnt++;
            }
        }
        System.out.println(cnt);
    }
}
