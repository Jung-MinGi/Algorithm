import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == -1) continue;
            if (b == -1 && c != -1) continue;
            if (b != -1) {
                if (c == -1) {
                    if(a<=b)cnt++;
                }else{
                    if(a<=b&&b<=c)cnt++;
                }
            }else cnt++;

        }
        System.out.println(cnt);

    }
}

