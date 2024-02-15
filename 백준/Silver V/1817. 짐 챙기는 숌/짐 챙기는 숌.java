import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int[] box;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if(n==0){
            System.out.println(0);
            return;
        }
        box = new int[n];
        int[] answer= new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            box[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> stack = new Stack<>();
        int idx = 0;
        while(idx!=n){
            if(stack.isEmpty()){
                stack.add(box[idx]);
                idx++;
                continue;
            }
            Integer peek = stack.peek();
            if(peek+box[idx]<=m){
                stack.add(stack.pop()+box[idx]);
            }else stack.add(box[idx]);
            idx++;
        }

        System.out.println(stack.size());
    }
}