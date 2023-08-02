import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

static Stack<Character> spare = new Stack<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        String s = br.readLine();
        for (char c : s.toCharArray()) {
            stack.push(c);
        }
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(n-->0){
          st = new StringTokenizer(br.readLine());
          String order = st.nextToken();
          if(order.equals("P")){
            stack.push(st.nextToken().toCharArray()[0]);
            continue;
          }
          if(order.equals("L")){//왼쪽으로 한칸 옮김
            if(stack.size()==0) continue;
            spare.push(stack.pop());
          }else if(order.equals("D")){//오른쪽으로 옮김
            if(spare.size()==0) continue;
            stack.push(spare.pop());
          }else if(order.equals("B")){//커서 왼쪽 문자 삭제
              if(stack.size()==0) continue;
              stack.pop();
          }
        }
        for (Character character : stack) {
            sb.append(character);
        }
        int size = spare.size();
        for (int i=0; i<size; i++) {
            sb.append(spare.pop());
        }
        System.out.println(sb);
    }
}