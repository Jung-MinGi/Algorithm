import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<Integer> stack;
        StringBuilder sb = new StringBuilder();
        while(n-->0){
            boolean flag=true;
            st= new StringTokenizer(br.readLine());
            stack = new Stack<>();
            while(st.hasMoreTokens()){
                String a = st.nextToken();
                for(int i=0; i<a.length(); i++){
                    char s = a.charAt(i);
                    if(s=='('){
                        stack.push(1);
                    }else{
                        if(stack.size()==0){
                            flag=false;
                            break;
                        }
                        Integer pop = stack.pop();
                    }
                }
            }
            if(flag && stack.size()==0){
                sb.append("YES");
            }else{
                sb.append("NO");
            }
            sb.append('\n');
        }
        System.out.println(sb);    }

}