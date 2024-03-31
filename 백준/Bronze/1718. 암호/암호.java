import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        String a = br.readLine();
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append(' ');
                idx++;
            } else {
                int dis = a.charAt(idx) - 96;
                sb.append(soultion(s.charAt(i), dis));
                idx++;
                
            }
            if (idx == a.length()) idx = 0;
        }
        System.out.println(sb);
    }

    static char soultion(char a, int distance) {
        int ret = a - distance;
        if (ret < 97) {
            int i = 97 - ret;
            ret = ((char) 122 - i) + 1;
        }
        return (char) ret;
    }
}

