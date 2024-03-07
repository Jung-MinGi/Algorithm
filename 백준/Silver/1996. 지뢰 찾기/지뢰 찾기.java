import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        for (char[] chars : map) {
            Arrays.fill(chars,'0');
        }
        for(int i=0;i<n;i++){
            char[] s = br.readLine().toCharArray();
            for(int j=0;j<s.length;j++){
                soultion(i,j,s[j]-'0');
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               sb.append(map[i][j]);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static void soultion(int x, int y,int num) {
        if(num<0)return;
        map[x][y]='*';
        int[] dx = new int[]{-1,-1,0,1,1,1,0,-1};
        int[] dy = new int[]{0,1,1,1,0,-1,-1,-1};
        
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || ny < 0 || nx >= map.length || ny >= map.length || map[nx][ny]=='M'|| map[nx][ny]=='*') continue;
            int w = map[nx][ny]-'0' + num;
            if(w>=10)map[nx][ny]='M';
            else map[nx][ny]= (char) ('0'+w);
        }

    }
}


