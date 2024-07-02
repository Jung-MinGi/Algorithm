import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] menu = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            menu[i] = Integer.parseInt(br.readLine());
        }

        int student = Integer.parseInt(br.readLine());
        int answer = 0;

        while (student-- > 0) {
            answer += menu[Integer.parseInt(br.readLine())];
        }
        System.out.println(answer);
    }
}