import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visit;
    static int[][] arr;
    static ArrayList<Integer>[] graph;
    static int m;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
             m = Integer.parseInt(st.nextToken());//가로
             n = Integer.parseInt(st.nextToken());//세로
            int l = Integer.parseInt(st.nextToken());
            arr = new int[n+1][m+1];
            visit = new boolean[n+1][m+1];
            graph = new ArrayList[n+1];
            for(int i=0; i<graph.length; i++){
                graph[i] = new ArrayList<>();
            }

            for(int i=0; i<l; i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[b][a]=1;
                graph[b].add(a);
            }
            int warm=0;
            for(int i=0; i<graph.length; i++){
                for(int j=0; j<graph[i].size(); j++){
                    if(visit[i][graph[i].get(j)] || arr[i][graph[i].get(j)] ==0 ) continue;
                    warm+= dfs(new Pair(graph[i].get(j), i));
                }
            }
            System.out.println(warm);
        }
    }
    static int dfs(Pair pair){
        int[] x = {1,-1,0,0};
        int[] y = {0,0,1,-1};
        Queue<Pair> q = new LinkedList<>();
        q.offer(pair);
        visit[pair.y][pair.x]=true;
        while(!q.isEmpty()){
            Pair poll = q.poll();
            int a = poll.x;
            int b = poll.y;
            for(int i=0 ; i<4; i++){
                if(a+x[i]<=m && a+x[i]>=0 && b+y[i] <= n && b+y[i] >= 0){
                    if(arr[b+y[i]][a+x[i]] == 0 ||visit[b+y[i]][a+x[i]])continue;
                    visit[b+y[i]][a+x[i]] = true;
                    q.offer(new Pair(a+x[i],b+y[i]));
//                    graph[b+y[i]].contains(b+y[i])
                }
            }
        }
    return 1;
    }
}
class Pair{
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}



