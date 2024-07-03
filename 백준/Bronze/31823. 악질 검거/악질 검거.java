import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] str = new String[m];
            st = new StringTokenizer(br.readLine());
            int max = 0;
            for (int j = 0; j < m; j++) {
                str[j] = st.nextToken();
            }
            String name = st.nextToken();

            for (int j = 0; j < m; j++) {
                if (str[j].equals(".")) {
                    int cnt = 0;
                    for (int k = j; k < m; k++) {
                        if (str[k].equals(".")) cnt++;
                        else break;
                    }
                    max = Math.max(max, cnt);
                }
            }
            set.add(max);
            sb.append(max).append(' ').append(name).append('\n');
        }
        System.out.println(set.size());
        System.out.println(sb);
    }
}