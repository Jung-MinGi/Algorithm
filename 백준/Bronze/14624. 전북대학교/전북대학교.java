import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n % 2 == 0) System.out.println("I LOVE CBNU");
        else {
            for (int i = 0; i < n; i++) {
                System.out.print('*');
            }
            int a = ((n + 1) / 2) + 1;
            int b = ((n + 1) / 2) - 1;
            for (int i = 0; i <= n; i++) {

                if (i % 2 == 0) {
                    System.out.println();
                } else {
                    a--;
                    b++;
                    for (int j = 1; j <= b; j++) {
                        if (j == a) {
                            System.out.print("*");

                        } else if (j == b) {
                            System.out.print("*");

                        } else System.out.print(" ");
                    }
                }
            }
        }
    }
}
