import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] arr;
    static boolean[][] visit;
    static int n, m;
    static int row, col;
    static final int RED=0;
    static final int BLUE=1;
    static final int GREEN=2;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        visit = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char[] charArray = s.toCharArray();
            for (int j = 0; j < n; j++) {
                char c = charArray[j];
                if(c=='R') arr[i][j]=0;
                else if(c=='B') arr[i][j]=1;
                else arr[i][j]=2;
            }
        }
        int cnt=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visit[i][j]){
                    soultion(i,j);
                    cnt++;
                }
            }
        }    System.out.print(cnt+" ");
        cnt=0;
        visit = new boolean[n][n];
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!visit[i][j]){
                    soultion2(i,j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    static void soultion(int x, int y) {
        int targetNum=arr[x][y];
        int[] mx = new int[]{1, -1, 0, 0};
        int[] my = new int[]{0, 0, -1, 1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visit[x][y]=true;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 0; i < mx.length; i++) {
                int nx = poll[0] + mx[i];
                int ny = poll[1] + my[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if(arr[nx][ny]!=targetNum)continue;
                if(!visit[nx][ny]){
                    visit[nx][ny]=true;
                    q.add(new int[]{nx,ny});
                }
            }
        }
    }
    static void soultion2(int x, int y) {
        int targetNum=arr[x][y];
        int[] mx = new int[]{1, -1, 0, 0};
        int[] my = new int[]{0, 0, -1, 1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        visit[x][y]=true;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 0; i < mx.length; i++) {
                int nx = poll[0] + mx[i];
                int ny = poll[1] + my[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
                if(targetNum==1&&(arr[nx][ny]==0||arr[nx][ny]==2))continue;
                if(targetNum==0&&(arr[nx][ny]==1))continue;
                if(targetNum==2&&(arr[nx][ny]==1))continue;
                if(!visit[nx][ny]){
                    visit[nx][ny]=true;
                    q.add(new int[]{nx,ny});
                }
            }
        }
    }
}
