import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[x];
        for (int i = 0; i < x; i++) {
            a[i] = Integer.parseInt(st.nextToken()) + n;
        }
        x = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] b = new int[x];
        for (int i = 0; i < x; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < x; j++) {
                if (a[i] == b[j]) cnt++;
            }
        }
        System.out.println(cnt);

    }
}

