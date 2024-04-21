import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
static boolean[][] visit;
static char[][] a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visit = new boolean[n][m];
        a = new char[n][m];
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                a[i][j]=s.charAt(j);
            }
        }
        for(int i=0;i<m;i++){
                if(a[0][i]=='X'&&!visit[0][i]){
                    bfs(0,i);
        }}
        for(int i=0;i<m;i++){
            if(visit[n-1][i]){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println("ESCAPE FAILED");
    }
    static void bfs(int x,int b){
        int[] dx ={1};
        int[] dy ={0};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,b});
        visit[x][b]=true;
        while(!q.isEmpty()){
            int[] poll = q.poll();
            for(int i=0;i<1;i++){
                int nx = dx[i]+poll[0];
                int ny = dy[i]+poll[1];
                if(nx<0||ny<0||nx>=a.length||ny>=a[0].length||visit[nx][ny]||a[nx][ny]=='O')continue;
                visit[nx][ny]=true;
                q.add(new int[]{nx,ny});
            }
        }
    }
}
