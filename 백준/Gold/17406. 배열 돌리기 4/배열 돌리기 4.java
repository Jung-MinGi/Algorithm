import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int[][] arr;
    static int n;
    static int m;
    static int sum=5000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        arr = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        ArrayList<int[]> list = new ArrayList<>();
        while (k-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            list.add(new int[]{a, b, c});
        }
        recursive(0,list,new boolean[list.size()],new ArrayList<>());
        System.out.println(sum);
    }

    static void recursive(int depth,ArrayList<int[]> list, boolean[] visit,ArrayList<int[]> order) {
        if (depth == list.size()) {
            int[][] tmpArray = new int[n+1][m+1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    tmpArray[i][j] = arr[i][j];
                }
            }
            for (int[] ints : order) {
                int a = ints[0];
                int b = ints[1];
                int c = ints[2];
                int cnt=0;
                while(true){
                    int x = a - c + cnt;
                    int y = b - c + cnt;
                    int x1 = a + c - cnt;
                    int y1 = b + c - cnt;
                    if(x==x1||y==y1)break;
                    swap(tmpArray,x,y,x1,y1);
                    cnt++;
                }
            }
            for (int i = 1; i <= n; i++) {
                sum = Math.min(Arrays.stream(tmpArray[i]).sum(), sum);
            }
            return;
        }

        for(int i=0;i<list.size();i++){
            if(!visit[i]){
                visit[i]=true;
                order.add(list.get(i));
                recursive(depth+1,list,visit,order);
                visit[i]=false;
                order.remove(order.size()-1);
            }
        }
    }

    static int[][] swap(int[][] arr,int x, int y, int x1, int y1) {
        int next = arr[x][y];
        int tmp = 0;
        for (int i = y; i <= y1; i++) {
            if (i + 1 > y1) {
                next = tmp;
                break;
            }
            tmp = arr[x][i + 1];
            arr[x][i + 1] = next;
            next = tmp;
        }

        for (int i = x; i <= x1; i++) {
            if (i + 1 > x1) {
                next = tmp;
                break;
            }
            tmp = arr[i + 1][y1];
            arr[i + 1][y1] = next;
            next = tmp;
        }

        for (int i = y1; i >= y; i--) {
            if (i - 1 < y) {
                next = tmp;
                break;
            }
            tmp = arr[x1][i - 1];
            arr[x1][i - 1] = next;
            next = tmp;
        }

        for (int i = x1; i >= x; i--) {
            if (i - 1 < x) {
                next = tmp;
                break;
            }

            tmp = arr[i - 1][y];
            arr[i - 1][y] = next;
            next = tmp;
        }
return arr;
    }
}