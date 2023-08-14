import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(n-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int max = Math.max(x, y);
            int min = Math.min(x, y);
            int solution = solution(max ,min);
            sb.append((max/solution)*(min/solution)*solution).append('\n');
        }

        System.out.println(sb);
    }
    static int solution(int i,int j){
        if(j!=0){
            return solution(j,i%j);
        }return i;
    }
}
/**
 * 24 18
 * 18 6
 * 6 0
 */
