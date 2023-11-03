import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    static int n, m;
    static int[][] arr;
    static int[][][] answer;
    static boolean[][] visit;
    static ArrayList<Integer>[][] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        answer = new int[n][m][2];
        visit = new boolean[n][m];
        list= new ArrayList[1000][1000];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(String.valueOf(s.charAt(j) - '0'));
            }
        }
        for(int i=0;i<1000;i++){
            for(int j=0;j<1000;j++){

                list[i][j]=new ArrayList<>();
            }
        }
        int standardNum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visit[i][j] && arr[i][j] == 0) {
                    bfs(i, j,standardNum++);
                }
            }
        }
        int[] mx = new int[]{1, -1, 0, 0};
        int[] my = new int[]{0, 0, 1, -1};
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (answer[i][j][0]== 0) {
                    for(int k=0;k<4;k++){
                        int nx = i+ mx[k];
                        int ny = j+ my[k];
                        if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                        if(arr[nx][ny]==1)continue;
                        if(!list[i][j].contains(answer[nx][ny][1])){
                            list[i][j].add(answer[nx][ny][1]);
                            answer[i][j][0]+=answer[nx][ny][0];
                        }
                    }
                    answer[i][j][0]++;
                    sb.append(answer[i][j][0]%10);

                }else{
                    sb.append(arr[i][j]);
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }

    static void bfs(int x, int y,int idx) {
        int[] mx = new int[]{1, -1, 0, 0};
        int[] my = new int[]{0, 0, 1, -1};

        Queue<int[]> q = new LinkedList<>();
        Queue<int[]> findOneQ = new LinkedList<>();
        q.add(new int[]{x, y,idx});
        findOneQ.add(new int[]{x, y,idx});
        visit[x][y] = true;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + mx[i];
                int ny = poll[1] + my[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                //while안에서 0의개수를 찾음
                if (arr[nx][ny] == 0 && !visit[nx][ny]) {
                    findOneQ.add(new int[]{nx, ny,idx});
                    q.add(new int[]{nx,ny,idx});
                    visit[nx][ny] = true;
                }
            }
        }
        int size = findOneQ.size();
        while (!findOneQ.isEmpty()) {
            int[] poll = findOneQ.poll();
//            System.out.println("poll[2] = " + poll[2]);
            answer[poll[0]][poll[1]][0] = size;
            answer[poll[0]][poll[1]][1] = poll[2];
        }
    }
}