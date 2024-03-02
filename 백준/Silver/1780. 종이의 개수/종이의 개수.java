import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static int minus = 0;
    static int zero = 0;
    static int one = 0;
    static int n = 0;

    /**
     * 1780백준
     *
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       n =Integer.parseInt(br.readLine());
       arr = new int[n][n];
       for(int i=0;i<n;i++){
           StringTokenizer st = new StringTokenizer(br.readLine());
           for(int j=0;j<n;j++){
               arr[i][j]=Integer.parseInt(st.nextToken());
           }
       }
       partition(n,0,0);
        System.out.println(minus);
        System.out.println(zero);
        System.out.println(one);
    }

    static void partition(int size, int x, int y) {
            if(soultion(size,x,y)){
                        if (arr[x][y] == -1) minus++;
                        else if (arr[x][y] == 0) zero++;
                        else one++;
                return;
            }
        int newSize = size / 3;

            partition(newSize, x, y);
            partition(newSize, x, y + newSize);
            partition(newSize, x, y + (newSize * 2));

            partition(newSize, x + newSize, y);
            partition(newSize, x + newSize, y + newSize);
            partition(newSize, x + newSize, y + (newSize * 2));

            partition(newSize, x + (newSize * 2), y);
            partition(newSize, x + (newSize * 2), y + newSize);
            partition(newSize, x + (newSize * 2), y +(newSize * 2));
    }

    static boolean soultion(int size, int x, int y) {
        int standard = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != standard)return false;
            }
        }
        return true;
    }
}


