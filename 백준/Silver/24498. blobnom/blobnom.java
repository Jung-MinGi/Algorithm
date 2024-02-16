import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (n == 1) System.out.println(arr[0]);
        else if (n == 2) System.out.println(Math.max(arr[0], arr[1]));
        else {
            int adjacentMin = 0;
            int max = 0;
            for (int i = 1; i < n - 1; i++) {
                if (arr[i - 1] == 0 || arr[i + 1] == 0) continue;
                if (max + adjacentMin < arr[i] + Math.min(arr[i - 1], arr[i + 1])) {
                    adjacentMin = Math.min(arr[i - 1], arr[i + 1]);
                    max = arr[i];
                }
            }
            int a = max + adjacentMin;
            System.out.println(Math.max(Math.max(arr[0], arr[n - 1]), a));
        }
    }
}