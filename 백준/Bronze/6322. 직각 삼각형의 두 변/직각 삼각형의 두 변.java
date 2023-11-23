import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int a, b, c;//c는 빗변
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            cnt++;
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
            String s = null;
            double l = 0;
            if (a == 0) break;
            if (c != -1 && Math.max(a, b) >= c) {
                System.out.println("Triangle #" + cnt);
                System.out.println("Impossible.");
                System.out.println();
                continue;
            }
            if (a == -1 || b == -1) {
                s = (a>b?"b":"a");
                l = Math.sqrt(Math.pow(c, 2) - (a == -1 ? Math.pow(b, 2) : Math.pow(a, 2)));
                System.out.println("Triangle #" + cnt);
                System.out.println(s+" = " + String.format("%.3f", l));
                System.out.println();
            } else {
                l = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                System.out.println("Triangle #" + cnt);
                System.out.println("c = " + String.format("%.3f", l));
                System.out.println();
            }
        }
    }
}


