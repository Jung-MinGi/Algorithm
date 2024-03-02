import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] arr;
    static int cnt = 0;
    static int n, m, t;

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
            }
        }
        t = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(filter(i,j))cnt++;
            }
        }
        System.out.println(cnt);
    }


    static boolean filter(int x, int y) {
        if (x + 3 > n || y + 3 > m) return false;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = x ;i < x+3; i++) {
            for (int j = y; j < y+3; j++) {
               list.add(arr[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(4)>=t;
    }
}


