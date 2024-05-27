import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();
            int a = -1;
            for (int i = 0; i < s.length(); i++) {
                stack.push(s.charAt(i));
                if (stack.peek() == '0' || stack.peek() == '1') {
                    a = stack.peek() - '0';

                }
            }
            boolean flag = true;
            while(!stack.isEmpty()) {
                Character c = stack.pop();
                if (c=='0'||c=='1'){
                    flag = false;
                    continue;
                }
                if (flag) {
                    a = 1;
                } else {
                    if(a==0)a=1;
                    else a=0;
                }
            }
            System.out.println(a);
        }
    }
}
