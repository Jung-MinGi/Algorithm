import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    static int[] arr;
    static int n, m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());//w조카
        m = Integer.parseInt(st.nextToken());//과자 개수
        arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(binary());
    }

    static int binary() {
        boolean flag = false;
        int low = 1;
        int high = arr[arr.length - 1];

        int cnt = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            cnt = 0;
            for (int i = 0; i < m; i++) {
                cnt = cnt + (arr[i] / mid);
            }
            if (cnt >= n) flag = true;
            if (cnt < n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (flag) return low - 1;
        else return 0;
    }
}