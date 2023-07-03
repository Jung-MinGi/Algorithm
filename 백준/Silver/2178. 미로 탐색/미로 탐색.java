import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Coordinate{
    int x;
    int y;
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static boolean[][] visit;
    static int[][] arr;
    static int[][] counting;
    static int n;
    static int k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         k = Integer.parseInt(st.nextToken());

        visit = new boolean[n+1][k+1];
        arr = new int[n+1][k+1];
        counting = new int[n+1][k+1];

        for(int i=1; i<=n; i++){
            String str = br.readLine();
            for(int j=0; j<k; j++){
                arr[i][j+1]= str.charAt(j) - 48;
            }
        }
        bfs(1,1);
        System.out.print(counting[n][k]);
    }

    static void bfs(int a, int b){
        int[] x = {1,-1,0,0};
        int[] y = {0,0,1,-1};
        Queue<Coordinate> q = new LinkedList<>();
        Coordinate coordinate = new Coordinate(a,b);
        q.offer(coordinate);
        visit[a][b]=true;
        counting[a][b]=1;
        while(!q.isEmpty()) {
            Coordinate poll = q.poll();
            a = poll.x;
            b = poll.y;
            for (int i = 0; i < 4; i++) {
                if (a + x[i] >= 1 && b + y[i] >= 1 && a + x[i] <= n && b + y[i] <= k) {
                    if (arr[a + x[i]][b + y[i]] == 0 || visit[a + x[i]][b + y[i]] == true) continue;
                    q.offer(new Coordinate(a + x[i], b + y[i]));
                    visit[a + x[i]][b + y[i]] = true;
                    counting[a + x[i]][b + y[i]] = counting[a][b] + 1;

                }
            }
        }
    }
}



