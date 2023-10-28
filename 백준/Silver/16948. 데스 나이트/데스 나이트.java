import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static int n, startRow, startCol, targetRow, targetCol;
    static int[][] map;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n + 1][n + 1];
        visit = new boolean[n + 1][n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        startRow = Integer.parseInt(st.nextToken());
        startCol = Integer.parseInt(st.nextToken());
        targetRow = Integer.parseInt(st.nextToken());
        targetCol = Integer.parseInt(st.nextToken());
        System.out.println(soultion(startRow,startCol));
    }

    static int soultion(int row, int col) {
        int[] mx = new int[]{2, 2, -2, -2, 0, 0};
        int[] my = new int[]{1, -1, 1, -1, 2, -2};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{row, col,0});
        visit[row][col] = true;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            if(poll[0]==targetRow&&poll[1]==targetCol){
                return poll[2];
            }
            for (int i = 0; i < 6; i++) {
                int nx = poll[0]+mx[i];
                int ny = poll[1]+my[i];
                if(nx<0||nx>n||ny<0||ny>n)continue;
                if(!visit[nx][ny]){
                    visit[nx][ny]=true;
                    q.add(new int[]{nx,ny,poll[2]+1});
                }
            }
        }
        return -1;
    }
}