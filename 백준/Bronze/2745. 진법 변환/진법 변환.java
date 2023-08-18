import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        for (int i = 1; i < 27; i++) {
            map.put((char) (i + 64), 9 + i);
        }
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            if (map.containsKey(c)) {
                list.add(map.get(c));
            } else {
                list.add(Integer.parseInt(String.valueOf(c)));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int num = 1;
            for (int j = 0; j < i; j++) {
                num *= b;
            }
            answer += (num * list.get(i));
        }
        System.out.println(answer);
    }
}
