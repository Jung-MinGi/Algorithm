import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        double answer = 0;
        if (s.charAt(0) == 'A') answer += 4;
        else if (s.charAt(0) == 'B') answer += 3;
        else if (s.charAt(0) == 'C') answer += 2;
        else if (s.charAt(0) == 'D') answer += 1;
        else {
            System.out.println(answer);
            return;
        }

        if (s.charAt(1) == '+') answer += 0.3;
        else if (s.charAt(1) == '-') answer -= 0.3;
        System.out.println(answer);
    }
}
