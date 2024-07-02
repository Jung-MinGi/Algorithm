import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String substring = br.readLine().substring(0, 5);
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        while (n-- > 0) {
            if (br.readLine().startsWith(substring)) {
                answer++;
            }

        }
        System.out.println(answer);
    }
}