import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            int a = Integer.parseInt(br.readLine());
            if(a!=0){
                stack.push(a);
            }else{
                stack.pop();
            }
        }
        int sum=0;
        for (int integer : stack) {
            sum+=integer;
        }
        System.out.println(sum);


    }

}