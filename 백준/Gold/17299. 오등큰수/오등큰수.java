import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int[] counting = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=n; i++){
            arr[i]=Integer.parseInt(st.nextToken());
            counting[arr[i]]++;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=1; i<=n; i++){
            while(!stack.isEmpty() && (counting[arr[stack.peek()]] < counting[arr[i]])){
                arr[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        StringBuilder sb = new StringBuilder();
        stack.stream().iterator().forEachRemaining(i->arr[i]=-1);
        for(int i=1; i<=n; i++){
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);
    }
}
