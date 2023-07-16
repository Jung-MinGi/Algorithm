import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static int[] input;
    public static boolean[] visit;
    static int n;


    static int depth = 0;

    static StringBuilder  sb = new StringBuilder();
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            if(n==0){
                System.out.println(sb);
                break;
            }
            arr = new int[n];
            visit = new boolean[n];
            input = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = Integer.parseInt(st.nextToken());
            }


            dfs(0,0);
            sb.append('\n');
        }
    }
    static void dfs(int at,int depth){

        if(depth ==  6){
            for (int i : arr) {
                if(i==0)continue;
                sb.append(i).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i=at; i<input.length; i++){
            if(!visit[depth]){
                arr[depth]=input[i];
                visit[depth]=true;
                dfs(i+1,depth+1);
                visit[depth]=false;
            }
        }
    }
}