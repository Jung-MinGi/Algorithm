import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] rank = new int[5];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        rank[0] = 29;
        for (int i = 0; i < 4; i++) {
            rank[i] = Integer.parseInt(st.nextToken());
        }
        String str = br.readLine();
        Stack<Integer> stack = new Stack<>();
        int price = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case 'B':
                    if (stack.isEmpty()) {
                        stack.add(rank[0]-1);
                    }else{
                        Integer peek = stack.peek();
                        int a = rank[0] - 1 - peek;
                        stack.add(a);
                    }

                    break;
                case 'S':
                    if (stack.isEmpty()) {
                        stack.add(rank[1]-1);
                    }else{
                        Integer peek = stack.peek();
                        int a = rank[1]-1-peek;
                        stack.add(a);
                    }
                    break;
                case 'G':
                    if (stack.isEmpty()) {
                        stack.add(rank[2]-1);
                    }else{
                        Integer peek = stack.peek();
                        int a = rank[2]-1-peek;
                        stack.add(a);
                    }
                    break;
                case 'P':
                    if (stack.isEmpty()) {
                        stack.add(rank[3]-1);
                    }else{
                        Integer peek = stack.peek();
                        int a = rank[3]-1-peek;
                        stack.add(a);
                    }
                    break;
                case 'D':
                    if (stack.isEmpty()) {
                        stack.add(rank[3]);
                    }else{
                        Integer peek = stack.peek();
                        int a = rank[3];
                        stack.add(a);
                    }
                    break;
            }
        }
        while(!stack.isEmpty())price+=stack.pop();
        System.out.println(price);
    }
}