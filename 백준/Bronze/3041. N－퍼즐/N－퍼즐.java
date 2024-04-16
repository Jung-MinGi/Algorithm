import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static HashMap<Character, int[]> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init();
        int n = 0;
        for (int i = 0; i < 4; i++) {
            String s = br.readLine();
            for (int j = 0; j < 4; j++) {
                if (s.charAt(j) == '.') continue;
                char c = s.charAt(j);
                int[] ints = map.get(c);
                n+=Math.abs(i-ints[0])+Math.abs(j-ints[1]);
            }
        }
        System.out.println(n);
    }

    static void init() {
        int idx=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                map.put((char)('A'+idx),new int[]{i,j});
                idx++;
            }
        }
    }
}
