import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int solution = solution(n);
        if(n==0) System.out.println(1);
        else System.out.println(solution);
    }


    static int solution(int n) {
        if (n > 1) {
            return solution(n - 1) * n;
        }
        return n;
    }
}
