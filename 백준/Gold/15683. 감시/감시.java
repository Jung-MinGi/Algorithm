import java.io.BufferedReader;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int answer = 0;
    static int[][] arr;
    static ArrayList<int[]> cctv = new ArrayList<>();
    static int n;
    static int m;
    static int max=70;
//5 5
//1 4 0 5 0
//0 0 0 0 0
//4 0 0 0 3
//5 6 3 0 0
//0 0 0 0 0
    /**
     * 5 5
     * 1 4 0 5 0
     * 0 0 0 0 0
     * 4 0 0 0 3
     * 5 6 3 0 0
     * 0 0 0 0 0
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if (arr[i][j] != 0 && arr[i][j] != 6) {
                    cctv.add(new int[]{i, j});
                }
            }
        }
        cctvRecursive(0);
        System.out.println(max);
    }

    static void cctvRecursive(int depth) {
        if (depth == cctv.size()) {
           int cnt=0;
            for (int[] ints : arr) {
                for (int anInt : ints) {
                    if(anInt==0)cnt++;
                }
            }
            max = Math.min(max,cnt);
//            if(cnt==2){
//                for (int[] ints : arr) {
//                    for (int anInt : ints) {
//                        System.out.print(anInt);
//                    }
//                    System.out.println();
//                }
//            }
            return;
        }
        int[] cor = cctv.get(depth);
        int i = arr[cor[0]][cor[1]];
        if (i == 1) {
            for (int j = 0; j < 4; j++) {
                if(j==0){
                    up(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    up(i,cor[0],cor[1],1);
                }else if(j==1){
                    right(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    right(i,cor[0],cor[1],1);
                }else if(j==2){
                    down(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    down(i,cor[0],cor[1],1);
                }else{
                    left(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    left(i,cor[0],cor[1],1);
                }
            }
        } else if (i == 2) {
            for (int j = 0; j < 2; j++) {
                if(j==0){
                    up(i,cor[0],cor[1],-1);
                    down(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    up(i,cor[0],cor[1],1);
                    down(i,cor[0],cor[1],1);
                }else{
                    left(i,cor[0],cor[1],-1);
                    right(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    left(i,cor[0],cor[1],1);
                    right(i,cor[0],cor[1],1);
                }
            }
        } else if (i == 3) {
            for (int j = 0; j < 4; j++) {
                if(j==0){
                    up(i,cor[0],cor[1],-1);
                    right(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    up(i,cor[0],cor[1],1);
                    right(i,cor[0],cor[1],1);
                }else if(j==1){
                    right(i,cor[0],cor[1],-1);
                    down(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    right(i,cor[0],cor[1],1);
                    down(i,cor[0],cor[1],1);
                }else if(j==2){
                    down(i,cor[0],cor[1],-1);
                    left(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    down(i,cor[0],cor[1],1);
                    left(i,cor[0],cor[1],1);
                }else{
                    left(i,cor[0],cor[1],-1);
                    up(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    left(i,cor[0],cor[1],1);
                    up(i,cor[0],cor[1],1);
                }
            }
        } else if (i == 4) {
            for (int j = 0; j < 4; j++) {
                if(j==0){
                    left(i,cor[0],cor[1],-1);
                    up(i,cor[0],cor[1],-1);
                    right(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    left(i,cor[0],cor[1],1);
                    up(i,cor[0],cor[1],1);
                    right(i,cor[0],cor[1],1);
                }else if(j==1){
                    up(i,cor[0],cor[1],-1);
                    right(i,cor[0],cor[1],-1);
                    down(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    up(i,cor[0],cor[1],1);
                    right(i,cor[0],cor[1],1);
                    down(i,cor[0],cor[1],1);
                }else if(j==2){
                    right(i,cor[0],cor[1],-1);
                    down(i,cor[0],cor[1],-1);
                    left(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    right(i,cor[0],cor[1],1);
                    down(i,cor[0],cor[1],1);
                    left(i,cor[0],cor[1],1);
                }else{
                    up(i,cor[0],cor[1],-1);
                    left(i,cor[0],cor[1],-1);
                    down(i,cor[0],cor[1],-1);
                    cctvRecursive(depth+1);
                    up(i,cor[0],cor[1],1);
                    left(i,cor[0],cor[1],1);
                    down(i,cor[0],cor[1],1);
                }
            }
        } else {
            for (int j = 0; j < 1; j++) {
                up(i,cor[0],cor[1],-1);
                left(i,cor[0],cor[1],-1);
                down(i,cor[0],cor[1],-1);
                right(i,cor[0],cor[1],-1);
                cctvRecursive(depth+1);
                up(i,cor[0],cor[1],1);
                left(i,cor[0],cor[1],1);
                down(i,cor[0],cor[1],1);
                right(i,cor[0],cor[1],1);
            }
        }
    }


    /**
     * cctv위쪽
     */
    static void up(int type,int x, int y, int delta) {
        for (int i = x - 1; i >= 0; i--) {
            if (arr[i][y] == 6) break;
            if(arr[i][y]>=1&&arr[i][y]<6)continue;
            if(arr[i][y]!=type)arr[i][y] += delta;

        }
    }

    /**
     * cctv오른쪽
     */
    static void right(int type,int x, int y, int delta) {
        for (int i = y + 1; i < m; i++) {
            if (arr[x][i] == 6) break;
            if(arr[x][i]>=1&&arr[x][i]<6)continue;
            if(arr[x][i]!=type)arr[x][i] += delta;
        }
    }

    /**
     * cctv아래
     */
    static void down(int type,int x, int y, int delta) {
        for (int i = x + 1; i < n; i++) {
            if (arr[i][y] == 6) break;
            if(arr[i][y]>=1&&arr[i][y]<6)continue;
            if(arr[i][y]!=type)arr[i][y] += delta;
        }
    }

    /**
     * cctv왼쪽
     */
    static void left(int type,int x, int y, int delta) {
        for (int i = y - 1; i >= 0; i--) {
            if (arr[x][i] == 6) break;
            if(arr[x][i]>=1&&arr[x][i]<6)continue;
            if(arr[x][i]!=type)arr[x][i] += delta;
        }
    }
}