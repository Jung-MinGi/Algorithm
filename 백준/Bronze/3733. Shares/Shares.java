import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = "";
        while ((n = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(n);
            int a = Integer.parseInt(st.nextToken()) + 1;
            int x = Integer.parseInt(st.nextToken());
            System.out.println(x / a);
        }
    }
}
