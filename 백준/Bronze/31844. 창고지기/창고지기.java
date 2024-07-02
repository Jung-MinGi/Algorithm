import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '@') {
                boolean rightFlag = false;
                for (int j = i; j < s.length(); j++) {
                    if (s.charAt(j) == '#') rightFlag = true;
                    if (s.charAt(j) == '!') {
                        if (rightFlag) {
                            System.out.println(Math.abs(j - i - 1));
                            return;
                        }
                    }
                }

                boolean leftFlag = false;
                for (int j = i; j >= 0; j--) {
                    if (s.charAt(j) == '#') leftFlag = true;
                    if (s.charAt(j) == '!') {
                        if (leftFlag) {
                            System.out.println(Math.abs(i - j - 1));
                            return;
                        }
                    }
                }
                break;
            }
        }
        System.out.println(-1);
    }

}