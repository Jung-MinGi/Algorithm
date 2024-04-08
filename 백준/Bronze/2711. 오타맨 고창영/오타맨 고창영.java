import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            char[] charArray = st.nextToken().toCharArray();
            for (int i = 0; i < charArray.length; i++) {
                if(i==a-1)continue;
                sb.append(charArray[i]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
