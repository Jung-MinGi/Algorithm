import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static int n, m;
    static int answer=Integer.MAX_VALUE;
    static boolean[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                char c = str.charAt(j);
                if (c == 'B') {
                    graph[i][j] = true;
                } else {
                    graph[i][j] = false;
                }
            }
        }
        int col = n - 7;
        int row = m- 7;

        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                find(i,j);
            }
        }
        System.out.println(answer);

    }
    static void find(int col,int row){
        int cnt=0;
        int a = col+8;
        int b = row+8;
        boolean preColor = graph[col][row];
        for(int i=col; i<a; i++){
            for(int j=row; j<b; j++){
                if(graph[i][j] != preColor){
                    cnt++;
                }
                preColor = (!preColor);
            }preColor = (!preColor);
        }
        int min = Math.min(cnt, 64 - cnt);
        answer = Math.min(Main.answer, min);
    }
}
