import javax.print.attribute.standard.Finishings;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

class Main {
    static int[][] graph;
    static long[][] arr;
    static int n = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        arr = new long[n][n];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
       arr[0][0]=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int m = graph[i][j];
                if(m==0)break;
               if(j+m<n) arr[i][j+m]+=arr[i][j];
               if(i+m<n) arr[i+m][j]+=arr[i][j];
            }
        }
        System.out.println(arr[n-1][n-1]);
    }




}
