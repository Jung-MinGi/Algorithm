import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] box;
    static int[] book;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        box = new int[n];
        book = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            box[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            book[i] = Integer.parseInt(st.nextToken());
        }
        int boxIdx = 0;
        int bookIdx = 0;
        while (boxIdx < n && bookIdx < m) {
            if (box[boxIdx] >= book[bookIdx]) {
                box[boxIdx] -= book[bookIdx];
                bookIdx++;
            } else boxIdx++;
        }
        int answer = 0;
        for (int i : box) {
            answer += i;
        }
        System.out.println(answer);
    }
}
