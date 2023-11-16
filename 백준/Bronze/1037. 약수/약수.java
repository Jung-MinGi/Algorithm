import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static int[] arr;
    static HashMap<Integer,Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if (n == 1) {
            System.out.println(arr[0] * arr[0]);
            return;
        } else if (n == 2) {
            System.out.println(arr[0] * arr[1]);
            return;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]*arr[n-1]);

    }
}


