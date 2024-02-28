import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visit;
    static String s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int x=0;
        while (true) {
            x++;
            int t = Integer.parseInt(br.readLine());
            int[] payback = new int[t + 1];
            HashMap<Integer, String> map = new HashMap<>();
            if (t == 0) break;
            int idx = 1;
            while (t-- > 0) {
                map.put(idx, br.readLine());
                idx++;
            }
            for (int i = 1; i < (payback.length - 1) * 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                payback[Integer.parseInt(st.nextToken())]++;
                String s1 = st.nextToken();
            }
            for(int i=1;i<payback.length;i++){
                if(payback[i]==1){
                    sb.append(x).append(" ").append(map.get(i)).append('\n');
                    break;}
            }
        }
        System.out.println(sb);
    }
}
