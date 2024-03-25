import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt=0;
        ArrayList<Integer> list = new ArrayList<>();
        while (++cnt<=a) {
            int i = Integer.parseInt(br.readLine());
            for (int j = 0; j < i; j++) {
                list.add(cnt);
            }
        }
        while (b-- > 0) {
            System.out.println(list.get(Integer.parseInt(br.readLine())));
        }
    }
}
