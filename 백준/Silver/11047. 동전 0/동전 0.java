import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n, m;
    static int cnt=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        while(n-->0){
            stack.add(Integer.parseInt(br.readLine()));
        }
        while(!stack.isEmpty()){
            Integer pop = stack.pop();
            if(m>=pop){
                cnt+=m/pop;
                m=m%pop;
            }
            if(m==0)break;
        }
        System.out.println(cnt);
    }
}
