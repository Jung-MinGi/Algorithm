import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    static class Node{
        int x,y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static int x, y;
    static int[][] graph;
    static boolean[][] visit;
    static int n,m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visit = new boolean[n][m];
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                int a = Integer.parseInt(st.nextToken());
                graph[i][j] = a;
                if (a == 1 && flag) {
                    x = i;
                    y = j;
                    flag=false;
                }
            }
        }
        bfs(x,y);
        


    }
    static void bfs(int x,int y){
        int[] a = {1,-1,0,0};
        int[] b = {0,0,1,-1};
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(x,y));
        visit[x][y]=true;
        while(!q.isEmpty()){
            Node poll = q.poll();
            for(int i=0; i<4; i++){
                int i1 = poll.x + a[i];
                int i2 = poll.y + b[i];
                if(i1>=0 && i1<n && i2>=0 && i2<m){
                    if(!visit[poll.x + a[i]][poll.y + b[i]] &&graph[poll.x + a[i]][poll.y + b[i]]==1){
                        graph[poll.x + a[i]][poll.y + b[i]]=1+graph[poll.x][poll.y];
                        System.out.println(graph[poll.x][poll.y]);
                        System.exit(0);
                    }
                    if(graph[poll.x + a[i]][poll.y + b[i]]==0 && !visit[poll.x + a[i]][poll.y + b[i]]){
                        graph[poll.x + a[i]][poll.y + b[i]]=1+graph[poll.x][poll.y];
                        visit[poll.x + a[i]][poll.y + b[i]]=true;
                        q.offer(new Node(poll.x + a[i],poll.y + b[i]));
                    }
                }
            }
        }
    }
}
