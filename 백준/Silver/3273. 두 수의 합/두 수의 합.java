import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int start = 0;
        int end = n - 1;
        int cnt = 0;
        Arrays.sort(arr);
        while (start < end) {
            int sum = arr[start] + arr[end];

            if (sum >= m) end--;
            else if(sum < m) start++;

            if(sum == m )cnt++;
        }
        System.out.println(cnt);

    }

}


