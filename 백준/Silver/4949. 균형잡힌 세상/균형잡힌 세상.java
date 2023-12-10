import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n;
        StringBuilder sb = new StringBuilder();
        while (true) {
            n = br.readLine();
            boolean flag=true;
            if (n.length() == 1 && n.charAt(0) == '.') break;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < n.length(); i++) {
                char s = n.charAt(i);
                if(s=='('||s=='[') {
                    stack.push(s);
                    continue;
                }
                if(s==')'){
                   if(!stack.empty()&&stack.peek()=='(')stack.pop();
                   else{
                       flag=false;
                       break;
                   }
                }
                else if(s==']'){
                    if(!stack.empty()&&stack.peek()=='[')stack.pop();
                    else{
                        flag=false;
                        break;
                    }
                }

            }
            if (flag&&stack.isEmpty()) {
                sb.append("yes").append('\n');
            } else sb.append("no").append('\n');
        }
        System.out.println(sb);
    }
}


