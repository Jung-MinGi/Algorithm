import java.io.BufferedReader;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.MemoryType;
import java.util.*;

public class Main {

    static int answer = 0;
    static int[][] arr;
    static ArrayList<int[]> cctv = new ArrayList<>();
    static int n;
    static int m;
    static int max = 0;
    static int min = 256;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int givenBlock = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, arr[i][j]);
                max = Math.max(max, arr[i][j]);
            }
        }
        int answer = 0;
        int answerTime = Integer.MAX_VALUE;
        for (int i = min; i <= max; i++) {
            int time = 0;
            int block = givenBlock;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    int height = arr[j][k];
                    if (height == i) continue;
                    if (height > i) {
                        time += (height - i) * 2;
                        block += (height - i);
                    } else {
                        time += i - height;
                        block -= i - height;
                    }
                }
            }

            if (block < 0) continue;
            if (answerTime >= time) {
                answer = i;
                answerTime = time;
            }
        }
        System.out.println(answerTime + " " + answer);
    }
}