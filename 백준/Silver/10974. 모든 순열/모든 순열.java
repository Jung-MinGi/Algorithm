import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] visit;
   static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        visit = new boolean[n];
        dfs(0);
        System.out.println(sb);
        }
    static void dfs(int depth){
        if(depth == n){
            for (int i : arr) {
                sb.append(i).append(' ');
            }sb.append('\n');
            return;
        }

        for(int i=0; i<n; i++){
            if (!visit[i]) {
                arr[depth]=i+1;
                visit[i]=true;
                dfs(depth+1);
                visit[i]=false;
            }
        }
    }

}