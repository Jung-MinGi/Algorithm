import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int answer = 10;
//        if (s.charAt(0) == '(') answer += 10;
//        else answer += 5;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) answer += 5;
            else answer += 10;
        }
        System.out.println(answer);
    }
}
