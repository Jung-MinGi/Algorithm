import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Main {
    static String[] a;
    static HashMap<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
        a = new String[s.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.charAt(i) + "";
        }
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;
            StringBuilder sb = new StringBuilder();
            s = st.nextToken();
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[j].equals(s.charAt(i) + "")) sb.append(a[(j + n) % a.length]);
                }
            }
            System.out.println(sb.reverse());
        }
    
    }
}

