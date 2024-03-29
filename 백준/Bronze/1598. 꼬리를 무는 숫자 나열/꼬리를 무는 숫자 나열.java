import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int rA = a % 4 == 0 ? 4 : a % 4;
        int cA = a % 4 == 0 ? a / 4 - 1 : a / 4;
        int rB = b % 4 == 0 ? 4 : b % 4;
        int cB = b % 4 == 0 ? b / 4 - 1 : b / 4;
        System.out.println(Math.abs(rA - rB) + Math.abs(cA - cB));
    }
}

