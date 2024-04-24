import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= tc; i++) {
            System.out.println(i + ". " + br.readLine());
        }
    }
}
