import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static boolean[] visit;
    static int n,m;
    static int[] inputArr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];
        visit = new boolean[n+1];
        inputArr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            inputArr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(inputArr);
        dfs(0);
        System.out.println(sb);
    }
    static void dfs(int depth){


        if(depth == m){//재귀 탈출
            for (int i : arr) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i<inputArr.length; i++) {
            if(!visit[i]){
                arr[depth]=inputArr[i];
                visit[i]=true;
                dfs(depth+1);
                visit[i]=false;
            }
        }
    }
}