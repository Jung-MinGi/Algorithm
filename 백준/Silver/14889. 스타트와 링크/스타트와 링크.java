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
        dfs(0);
        System.out.println(answer);
    }
    static void dfs(int depth){
        if(depth == arr.length){//재귀 탈출
            int home=0;
            int away=0;
            int[] anotherTeam = new int[n+1];
            for (int i : arr) {
                anotherTeam[i]++;
            }
            for(int i=0; i<arr.length-1; i++){
                for(int j=i+1; j<arr.length; j++){
                    home += graph[arr[i]][arr[j]]+graph[arr[j]][arr[i]];
                }
            }
            
            for(int i=1; i<anotherTeam.length-1; i++){
                if(anotherTeam[i]==1) continue;
                for(int j=i+1; j<anotherTeam.length; j++){
                    if(anotherTeam[j]==1)continue;
                    away += graph[i][j]+graph[j][i];
                }
            }
            answer = Math.min(answer,Math.abs(home-away));
            
            return;
        }

        for (int i=1; i<=n; i++) {
            if(depth>0 && arr[depth-1] > i) continue;
            if(!visit[i]){
                arr[depth]=i;
                visit[i]=true;
                dfs(depth+1);
                if(answer==0) break;
                visit[i]=false;
            }
        }
    }
}