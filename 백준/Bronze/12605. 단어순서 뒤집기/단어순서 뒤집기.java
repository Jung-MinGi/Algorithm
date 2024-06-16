import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            Stack<String> stack = new Stack<>();
            while(st.hasMoreTokens())stack.add(st.nextToken());
            System.out.print("Case #" + i + ": ");
            while(!stack.isEmpty()){
                System.out.print(stack.pop());
                System.out.print(" ");
            }
            System.out.println();

        }
    }
}
