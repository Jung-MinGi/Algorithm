import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    private static final int MOD = 10007;
    private static int[] dp;
    static int answer = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < a; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String s = st.nextToken();
                map.put(s, map.getOrDefault(s, 0) + 1);
            }
            answer=1;
            for (String s : map.keySet()) {
                answer*=map.get(s)+1;
            }
            sb.append(answer-1).append('\n');
        }
        System.out.println(sb);

    }
}
