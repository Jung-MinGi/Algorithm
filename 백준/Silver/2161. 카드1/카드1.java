import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine()) + 1;
        while (n-- > 0) {
            deque.addFirst(n);
        }
        deque.pollFirst();
        while (!deque.isEmpty()) {
            System.out.print(deque.pollFirst() + " ");
            if (deque.isEmpty()) break;
            Integer i = deque.pollFirst();
            deque.addLast(i);
        }
    }


}
