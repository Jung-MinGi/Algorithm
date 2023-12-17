import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreElements()){
            int i = Integer.parseInt(st.nextToken());
            int gcd = gcd(a, i);
            sb.append(a/gcd).append("/").append(i/gcd).append('\n');
        }
        System.out.println(sb);
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
