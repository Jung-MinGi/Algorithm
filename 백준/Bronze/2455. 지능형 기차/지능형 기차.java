import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = stack.size();
        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            train(a, true);
            int b = Integer.parseInt(st.nextToken());
            train(b, false);
            max = Math.max(max, stack.size());

        }
        System.out.println(max);
    }

    static void train(int x, boolean flag) {
        for (int i = 1; i <= x; i++) {
            if (flag) stack.pop();
            if (!flag) stack.add(1);
        }

    }

}