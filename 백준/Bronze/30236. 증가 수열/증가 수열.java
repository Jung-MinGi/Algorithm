import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int top = 0;
    static int bottom = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            arr = new int[a];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < a; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int max = 0;
            ArrayList<Integer> list = new ArrayList<>();
            list.add(max);
            for (int i : arr) {
                Integer x = list.get(list.size() - 1) + 1;
                if (x == i) {
                    x+=1;
                    list.add(x);
                }
                else list.add(x);
            }
            System.out.println(list.get(list.size()-1));
        }

    }
}