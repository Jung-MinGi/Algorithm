import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static Deque<int[]> deque = new ArrayDeque<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        while (n > 0) {
            deque.addFirst(new int[]{n, 0});
            n--;
        }
        while (true) {
            int[] ints = deque.peekFirst();
            ints[1] += 1;
            if (ints[1] == m) break;
            if (ints[1] % 2 == 1) searchRight(l);
            else searchLeft(l);
        }
        int answer = 0;
        for (int[] ints : deque) {
            answer += ints[1];
        }
        System.out.println(answer - 1);
    }

    static void searchLeft(int rep) {
        while (rep-- > 0) {
            int[] ints = deque.pollLast();
            deque.addFirst(ints);
        }
    }

    static void searchRight(int rep) {
        while (rep-- > 0) {
            int[] ints = deque.pollFirst();
            deque.addLast(ints);
        }
    }
}

