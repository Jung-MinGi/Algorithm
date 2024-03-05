import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /**
     * 1455백준
     */
    static int[][] arr;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }
        int count=0;
        while(true){
            int[] coordinate = getFarthestCoordinate();
            if(coordinate==null)break;
            reverse(coordinate[0],coordinate[1]);
            count++;
        }
        System.out.println(count);
    }

    static int[] getFarthestCoordinate() {
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) list.add(new int[]{i, j});
            }
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) return b[1] - a[1];
                else return b[0] - a[0];
            }
        });
        return list.isEmpty() ?null:list.get(0);
    }

    static void reverse(int a, int b) {
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                arr[i][j] = (arr[i][j] == 1) ? 0 : 1;
            }
        }
    }


}


