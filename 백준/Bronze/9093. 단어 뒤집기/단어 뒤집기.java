import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int t = Integer.parseInt(br.readLine());
       StringBuilder sb = new StringBuilder();
       StringTokenizer st;
       while(t-->0){
           Stack<Character> stack = new Stack<>();
           st = new StringTokenizer(br.readLine());
           while(st.hasMoreTokens()){
               String s = st.nextToken();
               for(int i=s.length()-1; i>=0; i--){
                sb.append(s.charAt(i));
               }sb.append(" ");
           }sb.append('\n');
       }
        System.out.print(sb);
    }

}