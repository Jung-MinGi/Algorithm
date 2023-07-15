import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static boolean[] visit;
    static int n,m;
    static int[][] graph;

    static int answer=Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n/2];
        visit = new boolean[n+1];
        graph = new int[n+1][n+1];
        StringTokenizer st;
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++){
                graph[i][j] =  Integer.parseInt(st.nextToken());
            }
        }
        dfs(1,0);
        System.out.println(answer);
    }
    static void dfs(int start,int depth){
        if(depth == n/2){//재귀 탈출
            int home=0;
            int away=0;
            for(int i=1; i<visit.length-1; i++){
                for(int j=i+1; j<visit.length; j++){
                    if(visit[i]==true && visit[j]==true){
                        home += graph[i][j]+graph[j][i];
                    }else if(visit[i]==false && visit[j]==false){
                        away += graph[i][j]+graph[j][i];
                    }
                }
            }
            answer = Math.min(answer,Math.abs(home-away));
            if(answer==0){
                System.out.println(answer);
                System.exit(0);
            }
            return;
        }

        for (int i=start; i<=n; i++) {

            if(!visit[i]){
                visit[i]=true;
                dfs(i+1,depth+1);
                visit[i]=false;
            }
        }
    }
}