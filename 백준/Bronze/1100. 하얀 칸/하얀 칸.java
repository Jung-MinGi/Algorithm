import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static char[][] arr = new char[8][8];
    static boolean[][] visit = new boolean[8][8];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<8;i++){
            String s = br.readLine();
            for(int j=0;j<8;j++){
                arr[i][j]=(s.charAt(j)=='.')?'.':'F';
            }
        }
        int answer = (arr[0][0]=='.')?0:1;
        visit[0][0]=true;
        int[] dx = new int[]{2,0,1};
        int[] dy = new int[]{0,2,1};

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        while(!q.isEmpty()){
            int[] poll = q.poll();
            for(int i=0;i<3;i++){
                int nx = dx[i]+poll[0];
                int ny = dy[i]+poll[1];
                if(nx<0||ny<0||nx>=8||ny>=8)continue;
                if(visit[nx][ny])continue;
                if(arr[nx][ny]=='F')answer++;
                q.add(new int[]{nx,ny});
                visit[nx][ny]=true;
            }
        }
        System.out.println(answer);
    }
}


