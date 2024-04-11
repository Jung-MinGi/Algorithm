import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Character> deque = new ArrayDeque<>();
        char[] charArray = br.readLine().toCharArray();
        for (char c : charArray) {
            deque.addLast(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            Character c = deque.pollFirst();
            sb.append(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                deque.pollFirst();
                deque.pollFirst();
            }
        }
        System.out.println(sb);
    }
}
