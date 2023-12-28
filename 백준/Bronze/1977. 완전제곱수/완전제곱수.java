import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = n; i <= m; i++) {
            if (i % Math.sqrt(i) == 0) {
                list.add(i);
            }
        }
        if (!list.isEmpty()) {
            Collections.sort(list);
            list.iterator().forEachRemaining(a -> sum += a);
            System.out.println(sum);
            System.out.println(list.get(0));
        } else System.out.println(-1);
    }


}
