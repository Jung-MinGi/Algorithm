import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        arr = new int[n + 1][3];
        int target = Integer.parseInt(st.nextToken());
        int[] targetMedal = new int[3];
        for (int j = 0; j < n; j++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            for (int i = 0; i < 3; i++) {
                arr[a][i] = Integer.parseInt(st.nextToken());
                if (a == target) targetMedal[i] = arr[a][i];
            }
        }

        int rank = 1;
        for (int i = 1; i <= n; i++) {
            if (i == target) continue;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] < targetMedal[j]) break;
                else if(arr[i][j] > targetMedal[j]){
                    rank++;
                    break;
                }else{
                    continue;
                }
            }
        }
        System.out.println(rank);
    }
}
