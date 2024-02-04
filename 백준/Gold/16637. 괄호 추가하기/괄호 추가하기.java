import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static String[] arr;
    static boolean[] operator;
    static int n;
    static int m;
    static int sum = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        arr = new String[n];
        operator = new boolean[n];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i));
            if (arr[i].equals("*") || arr[i].equals("+") || arr[i].equals("-")) m++;
        }
        combinationOperatorPriority(0, 0);
        System.out.println(sum);
    }

    static void combinationOperatorPriority(int idx, int depth) {
        if (depth == m) {
            boolean[] use = new boolean[n];
            Deque<String> deque = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                if (use[i]) continue;
                if (operator[i]) {
                    use[i] = true;
                    use[i + 1] = true;
                    String s = deque.pollLast();
                    int result = operating(s, arr[i], arr[i + 1]);
                    deque.addLast(String.valueOf(result));
                    continue;
                }
                deque.addLast(arr[i]);
                use[i] = true;
            }
            while (deque.size() != 1) {
                int result = operating(deque.pollFirst(), deque.pollFirst(), deque.pollFirst());
                deque.addFirst(result + "");
            }
            sum = Math.max(sum, Integer.parseInt(deque.pollFirst()));
            return;
        }

        for (int i = idx; i < n; i++) {
            if (arr[i].equals("*") || arr[i].equals("+") || arr[i].equals("-")) {


                if ((i == 1 && !operator[i]) || i != 1 && !operator[i] && !operator[i - 2]) {
                    operator[i] = true;
                    combinationOperatorPriority(i + 1, depth + 1);
                    operator[i] = false;
                }
            }
        }
        combinationOperatorPriority(idx + 1, depth + 1);
    }

    static int operating(String a, String b, String c) {
        if (b.equals("+")) return Integer.parseInt(a) + Integer.parseInt(c);
        else if (b.equals("*")) return Integer.parseInt(a) * Integer.parseInt(c);
        else return Integer.parseInt(a) - Integer.parseInt(c);
    }
}