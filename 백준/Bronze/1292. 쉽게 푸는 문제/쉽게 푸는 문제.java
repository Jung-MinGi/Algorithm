import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int sum = 0;
        for (int i = 1; i <= end; i++) {
            for (int j = 1; j <= i; j++) {
                cnt++;
                if (start <= cnt && cnt <= end) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
