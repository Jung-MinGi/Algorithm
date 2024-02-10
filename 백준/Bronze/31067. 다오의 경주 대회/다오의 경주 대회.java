import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] track;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        track = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            track[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int prevLen = track[i - 1];
            int currentLen = track[i];
            if (prevLen < currentLen) continue;
            else {
                track[i] += k;
                cnt++;
            }
            if (prevLen >= track[i]) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(cnt);
    }
}
