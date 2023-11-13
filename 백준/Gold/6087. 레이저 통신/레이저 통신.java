import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] arr;
    static boolean[][] visit;
    static int n, m;
    static int min = Integer.MAX_VALUE;
    static ArrayList<Integer> C = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char[] charArray = s.toCharArray();
            for (int j = 0; j < m; j++) {
                char c = charArray[j];
                if (c == '*') {
                    arr[i][j] = -1;
                } else if (c == '.') {
                    arr[i][j] = 0;
                } else if (c == 'C') {
                    arr[i][j] = 999;
                    C.add(i);
                    C.add(j);
                }

            }
        }
        soultion(C.get(2), C.get(3));
        System.out.println(min);
    }

    static void soultion(int x, int y) {
        int[] mx = new int[]{1, -1, 0, 0};
        int[] my = new int[]{0, 0, -1, 1};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x, y, 0, 0, 0});
        visit[x][y] = true;
        arr[x][y] = 0;
        while (!q.isEmpty()) {
            int[] poll = q.poll();
            int r = poll[0];
            int c = poll[1];
            if (r == C.get(0) && c == C.get(1)) {
                min = Math.min(poll[2], min);
                continue;
            }
            for (int i = 0; i < mx.length; i++) {
                int nx = r + mx[i];
                int ny = c + my[i];
                if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if (arr[nx][ny] == -1) continue;
                //이전에 어떻게 온지가 중요함
                if (poll[3] == 0 && poll[4] == 0) {
                    visit[nx][ny] = true;
                    q.add(new int[]{nx, ny, 0, mx[i], my[i]});
                    continue;
                }
                if (!visit[nx][ny]) {
                    if ((poll[3] == 1 || poll[3] == -1) && poll[4] == 0) {
                        if (i == 0 || i == 1) {
                            q.add(new int[]{nx, ny, poll[2], mx[i], my[i]});
                            arr[nx][ny] = poll[2];
                            arr[r][c]=poll[2];
                        } else {
                            q.add(new int[]{nx, ny, poll[2] + 1, mx[i], my[i]});
                            arr[nx][ny] = poll[2] + 1;
                            arr[r][c]=poll[2] + 1;
                        }
                    } else {
                        if (i == 2 || i == 3) {
                            q.add(new int[]{nx, ny, poll[2], mx[i], my[i]});
                            arr[nx][ny] = poll[2];
                            arr[r][c]=poll[2];
                        } else {//방향 꺾인 경우
                            q.add(new int[]{nx, ny, poll[2] + 1, mx[i], my[i]});
                            arr[nx][ny] = poll[2] + 1;
                            arr[r][c]=poll[2] + 1;
                        }
                    }
                    visit[nx][ny] = true;
                } else {//방문한 경우
                    if ((poll[3] == 1 || poll[3] == -1) && poll[4] == 0) {//이전에 세로 방향으로 움직인 경우
                        if(poll[3]==-1&&mx[i]==1)continue;
                        if(poll[3]==1&&mx[i]==-1)continue;
                        if (i == 0 || i == 1) {//그대로 방향 유지인 경우
                            if (arr[nx][ny] >= poll[2]) {
                                q.add(new int[]{nx, ny, poll[2], mx[i], my[i]});
                                arr[nx][ny] = poll[2];
                                arr[r][c]=poll[2];
                            }
                        } else {//방향 꺾인 경우
                            if (arr[nx][ny] >= poll[2] + 1) {
                                q.add(new int[]{nx, ny, poll[2] + 1, mx[i], my[i]});
                                arr[nx][ny] = poll[2] + 1;
                                arr[r][c]=poll[2] + 1;
                            }
                        }
                    } else {
                        if(poll[4]==-1&&my[i]==1)continue;
                        if(poll[4]==1&&my[i]==-1)continue;
                        if (i == 2 || i == 3) {
                            if (arr[nx][ny] > poll[2]) {
                                q.add(new int[]{nx, ny, poll[2], mx[i], my[i]});
                                arr[nx][ny] = poll[2];
                                arr[r][c]=poll[2];
                            }
                        } else {//방향 꺾인 경우
                            if (arr[nx][ny] >= poll[2] + 1) {
                                q.add(new int[]{nx, ny, poll[2] + 1, mx[i], my[i]});
                                arr[nx][ny] = poll[2] + 1;
                                arr[r][c]=poll[2] + 1;
                            }
                        }
                    }
                }
            }
        }
    }
}
