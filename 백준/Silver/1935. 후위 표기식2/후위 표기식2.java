import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        HashMap<Character, Double> map = new HashMap<>();
        Queue<Double> q = new LinkedList<>();
        while (n-- > 0) {
            q.offer((double) Integer.parseInt(br.readLine()));
        }
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                double backNum = stack.pop();
                double num = stack.pop();
                char c = s.charAt(i);
                double result = 0;
                if (c == '+') {
                    result = num + backNum;
                } else if (c == '-') {
                    result = num - backNum;
                } else if (c == '*') {
                    result = num * backNum;
                } else {
                    result = num / backNum;
                }
                stack.push(result);
                continue;
            }
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), q.poll());
            }
            stack.push(map.get(s.charAt(i)));
        }
        double finalResult = stack.pop();

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(df.format(finalResult));
    }
}
