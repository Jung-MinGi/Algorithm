import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(factorial(Integer.parseInt(br.readLine())));
    }

    static int factorial(int a) {
        if (a == 1) return 1;
        return factorial(a - 1) * a;
    }
}
