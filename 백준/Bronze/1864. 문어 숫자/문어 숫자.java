import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    static HashMap<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        setUp();
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s.equals("#")) break;
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                Integer a = map.get(s.charAt(i));
                int tmp = a * (int) Math.pow(8, s.length() - i-1);
                sum += tmp;
            }
            sb.append(String.valueOf(sum)).append('\n');
        }
        System.out.println(sb);
    }

    static void setUp() {
        map.put('-', 0);
        map.put('\\', 1);
        map.put('(', 2);
        map.put('@', 3);
        map.put('?', 4);
        map.put('>', 5);
        map.put('&', 6);
        map.put('%', 7);
        map.put('/', -1);
    }
}

