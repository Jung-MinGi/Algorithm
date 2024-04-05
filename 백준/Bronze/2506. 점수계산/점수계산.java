import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int answer = 0;
        int bonus = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0 && arr[i] == 1) {
                answer += bonus;
                bonus++;
                continue;
            }
            if (arr[i] == 1) {
                answer += bonus;
                bonus++;
            } else bonus = 1;

        }
        System.out.println(answer);
    }
}

