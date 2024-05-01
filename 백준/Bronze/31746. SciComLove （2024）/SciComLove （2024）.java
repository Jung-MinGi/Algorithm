import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = "SciComLove";
        if (n % 2 == 1) {
            System.out.println(new StringBuilder(s).reverse().toString());
        } else System.out.println(s);
    }
}

