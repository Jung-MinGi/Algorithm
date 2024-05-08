import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[5];
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if (x == 0 || y == 0) a[4]++;
            else if (x > 0 && y > 0) a[0]++;
            else if (x < 0 && y > 0) a[1]++;
            else if (x < 0 && y < 0) a[2]++;
            else a[3]++;
        }
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.println("AXIS" + ": " + a[i]);
                break;
            }
            System.out.println("Q" + (i + 1) + ": " + a[i]);
        }
    }

}
