import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] graph;
    static boolean[][] visit;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true){
            st = new StringTokenizer(br.readLine());
             n = Integer.parseInt(st.nextToken());//x
             m = Integer.parseInt(st.nextToken());
            if(n==0 && m==0) break;
            graph = new int[m][n];
            visit = new boolean[m][n];
            for(int i=0; i<m; i++){
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<n; k++){
                    graph[i][k]=Integer.parseInt(st.nextToken());
                }
            }
            int cnt=0;

            for(int i=0; i<m; i++){//y
                for(int k=0; k<n; k++){
                    if(visit[i][k]||graph[i][k]==0) continue;
                    cnt += bfs(i, k);
                }
            }

            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }
    static int bfs(int a,int b){//a ==y
        int[] x = {1,-1,0,0,1,1,-1,-1};
        int[] y = {0,0,1,-1,1,-1,1,-1};
        Queue<Node> q = new LinkedList<>();
        Node node = new Node(a, b);
        visit[a][b]=true;
        q.offer(node);
        while(!q.isEmpty()){
            Node poll = q.poll();
            for(int i=0; i<x.length; i++){
                if(poll.x+x[i] >= 0 && poll.x+x[i]<n && poll.y+y[i]>=0 && poll.y+y[i]<m){
                    if(graph[poll.y+y[i]][poll.x+x[i]] ==0 || visit[poll.y+y[i]][poll.x+x[i]])continue;
                    q.offer(new Node(poll.y + y[i],poll.x + x[i] ));
                    visit[poll.y + y[i]][poll.x + x[i]]=true;
                }
            }
        }
        return 1;
    }
    static class Node{
        int y;
        int x;

        public Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}

