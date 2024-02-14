import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int home = Integer.parseInt(br.readLine());
        int away = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        int c = 0;

        while (home > 2) {
            home -= 3;
            a++;
        }
        while (away > 2) {
            away -= 3;
            c++;
        }
        if (home == 1 && away == 1) b++;
        if (home != 0 || away != 0) System.out.println(-1);
        else System.out.println(a + " " + b + " " + c);
    }
}
