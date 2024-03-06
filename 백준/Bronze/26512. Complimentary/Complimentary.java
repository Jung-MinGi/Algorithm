import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0) break;
            sb.append(n).append(" = ").append(getEightBitBinary(n)).append('\n');
            sb.append(m).append(" = ").append(getEightBitBinary(m)).append('\n');
            sb.append(n * -1).append(" = ").append(Integer.toBinaryString(n * -1).substring(24)).append('\n');
            sb.append(m * -1).append(" = ").append(Integer.toBinaryString(m * -1).substring(24)).append('\n');
            if (n - m < 0)
                sb.append(n - m).append(" = ").append(Integer.toBinaryString(n - m).substring(24)).append('\n');
            else sb.append(n - m).append(" = ").append(getEightBitBinary(n - m)).append('\n');
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static String getEightBitBinary(int a) {
        String s = Integer.toBinaryString(a);
        while (8 - s.length() != 0) {
            s = "0" + s;
        }
        return s;
    }
}


