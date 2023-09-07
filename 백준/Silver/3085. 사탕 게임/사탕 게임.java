import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    static Integer[][] rowDp;
    static Integer[][] colDp;
    static String[][] arr;
    static Integer[][] dp;
    static boolean[][] visit;
    static StringTokenizer st;
    static StringBuilder sb;
    static int rowMax = 1;
    static int colMax = 1;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new String[n + 1][n + 1];
        dp = new Integer[n + 1][n + 1];
        colDp = new Integer[n + 1][n + 1];
        rowDp = new Integer[n + 1][n + 1];
        visit = new boolean[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j + 1] = String.valueOf(s.charAt(j));
            }
        }
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            findRowMax(i);
            findColMax(i);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + 1 <= n && !arr[i][j].equals(arr[i + 1][j])) {
                    swap(i, j, i + 1, j);
                    findRowMax(i);
                    findRowMax(i + 1);
                    findColMax(j);
                    swap(i, j, i + 1, j);
                }
                if(j+1<=n && !arr[i][j].equals(arr[i][j+1])){
                    swap(i,j,i,j+1);
                    findRowMax(i);
                    findColMax(j);
                    findColMax(j+1);
                    swap(i,j,i,j+1);
                }
            }
        }
        System.out.println(Math.max(rowMax,colMax));
    }

    static void findRowMax(int a) {
        int temp = 1;
        for (int i = 2; i <= n; i++) {
            if (!arr[a][i - 1].equals(arr[a][i])) {
                temp = 1;
            } else {
                temp++;
            }
            rowMax = Math.max(temp, rowMax);
        }
    }

    static void findColMax(int a) {
        int temp = 1;
        for (int i = 2; i <= n; i++) {
            if (!arr[i - 1][a].equals(arr[i][a])) {
                temp = 1;
            } else {
                temp++;
            }
            rowMax = Math.max(temp, rowMax);
        }
    }

    static void swap(int a, int b, int c, int d) {
        String temp = arr[a][b];
        arr[a][b] = arr[c][d];
        arr[c][d] = temp;
    }
}

