import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] arr = new int[]{1, 2, 4};


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        Deque<String> stack = new ArrayDeque<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            int a = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (a == 7) {
                stack.push("111");
            } else if (a == 6) {
                stack.push("110");
            } else if (a == 5) {
                stack.push("101");
            } else if (a == 4) {
                stack.push("100");
            } else if (a == 3) {
                stack.push("011");
            } else if (a == 2) {
                stack.push("010");
            } else if (a == 1) {
                stack.push("001");
            } else {
                stack.push("000");
            }
        }
        stack.stream().forEach(i -> sb.append(i));
        String string = sb.toString();
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i)=='0') sb.deleteCharAt(0);
            else break;

        }

        if(sb.length()==0) System.out.println(0);
        else  System.out.println(sb);


    }
}
