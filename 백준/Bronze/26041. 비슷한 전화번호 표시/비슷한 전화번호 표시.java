import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) list.add(st.nextToken());

        String s = br.readLine();
        int ans = 0;
        for (String string : list) {
            if (string.length() > s.length()) {
                if (string.startsWith(s)) ans++;
            }
        }
        System.out.println(ans);
    }
}
