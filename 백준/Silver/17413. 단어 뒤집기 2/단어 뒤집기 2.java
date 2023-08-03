import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int num = 0;
    static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        Queue<Character> q = new LinkedList<>();
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '<'){
                if(stack.size()!=0){
                    int size = stack.size();
                    for (int j = 0; j < size; j++) {
                        sb.append(stack.pop());
                    }
                }
                num++;
            }
            if (c == '>') num--;
            if (num > 0 || c == '>') {
                sb.append(c);
                continue;
            }

            if (c == ' ') {
                int size = stack.size();
                for (int j = 0; j < size; j++) {
                    sb.append(stack.pop());
                }
                sb.append(c);
                continue;
            }
            stack.push(c);
        }
        if (stack.size() != 0) {
            int size = stack.size();
            for (int j = 0; j < size; j++) {
                sb.append(stack.pop());
            }
        }
        System.out.println(sb);
    }
}
