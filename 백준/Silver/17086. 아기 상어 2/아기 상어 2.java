import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int answer=0;
    static int[][] map;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                map[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]==0)bfs(i,j);
            }
        }
        System.out.println(answer);
    }
    static void bfs(int x,int y){
        boolean[][] visit = new boolean[n][m];
        int[] dx = new int[]{1,-1,0,0,1,-1,-1,1};
        int[] dy = new int[]{0,0,1,-1,1,-1,1,-1};
        Queue<int[]> q= new LinkedList<>();
        q.add(new int[]{x,y,0});
        visit[x][y]=true;
        while(!q.isEmpty()){
            boolean flag=false;
            int[] poll = q.poll();
            for(int i=0;i<8;i++){
                int nx = poll[0]+dx[i];
                int ny = poll[1]+dy[i];
                if(nx<0||ny<0||nx>=n||ny>=m)continue;
                if(!visit[nx][ny]){
                    if(map[nx][ny]==1){
                        answer = Math.max(answer,poll[2]+1);
                        flag=true;
                        break;
                    }
                    visit[nx][ny]=true;
                    q.add(new int[]{nx,ny,poll[2]+1});
                }
            }
            if(flag)break;
        }
    }

}