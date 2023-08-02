import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack;
        StringBuilder sb = new StringBuilder();
        int max=0;
        stack = new Stack<>();
        while(n-->0){
            int a = Integer.parseInt(br.readLine());
            if(max < a) {
                for(int i=max+1; i<=a; i++){
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                max = stack.pop();
                sb.append('-').append('\n');
            }else if(stack.peek() == a){
                stack.pop();
                sb.append('-').append('\n');
            }else{
                sb.setLength(0);
                sb.append("NO");
                break;
            }
        }
        System.out.println(sb);
    }

}