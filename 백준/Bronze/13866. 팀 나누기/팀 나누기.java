import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[4];
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            a[i] = Integer.parseInt(st.nextToken());
            sum += a[i];
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) continue;
                int x = Math.abs(a[i] - a[j]);
                ArrayList<Integer> list = new ArrayList<>();
                for (int k = 0; k < 4; k++) {
                    if (k != i && k != j) {
                        list.add(k);
                    }
                }
                int y = Math.abs(a[list.get(0)] - a[list.get(1)]);
                answer = Math.min(answer, Math.abs(x - y));
            }
        }
        System.out.println(answer);
    }
}
