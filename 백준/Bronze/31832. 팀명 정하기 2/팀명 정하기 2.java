import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }
        for (String string : s) {
            if (string.length() <= 10 && uppercase(string) && isNumber(string)) {
                System.out.println(string);
                return;
            }
        }
    }

    static boolean uppercase(String s) {
        int uppercase = 0;
        int lowercase = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) uppercase++;
            else if (Character.isLowerCase(s.charAt(i))) lowercase++;
        }

        return uppercase <= lowercase;
    }

    static boolean isNumber(String s) {
        int character = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if (Character.isAlphabetic(s.charAt(i))) character++;
            else if(s.charAt(i)=='-')character++;
        }
        return character > 0;

    }
}