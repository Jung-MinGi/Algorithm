import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Deque<int[]> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            deque.add(new int[]{Integer.parseInt(st.nextToken()), i});
        }
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        while (!deque.isEmpty()) {
            int[] ints = null;
            if (flag) ints = deque.pollLast();
            else ints = deque.pollFirst();
            sb.append(ints[1]).append(' ');
            int idx = ints[0];
            if(deque.isEmpty())break;
            if (idx < 0) {
                flag=true;
                while (idx++ < -1) {
                    int[] tmp = deque.pollLast();
                    deque.addFirst(tmp);
                }

            } else {
                flag=false;
                while (idx-- > 1) {
                    int[] cmp = deque.pollFirst();
                    deque.addLast(cmp);
                }
            }
        }
        System.out.println(sb);
    }
}


