import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int answer = 0;
    static Character[][] island;
    static int n;
    static int m;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        island = new Character[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for(int j=0;j<m;j++){
                island[i][j]=s.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {

            for(int j=0;j<m;j++){
                if(island[i][j]=='W')continue;
                bfs(i,j,new boolean[n][m]);
            }
        }
        System.out.println(answer);

    }
    static void bfs(int x,int y,boolean[][] visit){
        int[] dx = new int[]{1,-1,0,0};
        int[] dy = new int[]{0,0,1,-1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y,0});
        visit[x][y]=true;

        while(!q.isEmpty()){
            int[] poll = q.poll();
            answer = Math.max(answer,poll[2]);
            for(int i=0;i<4;i++){
                int nx = dx[i] + poll[0];
                int ny = dy[i] + poll[1];
                if(nx<0||ny<0||nx>=n||ny>=m||island[nx][ny]=='W'||visit[nx][ny])continue;
                q.add(new int[]{nx,ny,poll[2]+1});
                visit[nx][ny]=true;
            }
        }
    }

}