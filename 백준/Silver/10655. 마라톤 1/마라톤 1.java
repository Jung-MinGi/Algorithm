import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        int officalDistance = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int x = arr[0][0];
        int y = arr[0][1];
        for (int i = 1; i < n; i++) {
            officalDistance += Math.abs(x - arr[i][0]) + Math.abs(y - arr[i][1]);
            x = arr[i][0];
            y = arr[i][1];
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i < n - 1; i++) {
            int front = Math.abs(arr[i][0] - arr[i - 1][0]) + Math.abs(arr[i][1] - arr[i - 1][1]);
            int back = Math.abs(arr[i][0] - arr[i + 1][0]) + Math.abs(arr[i][1] - arr[i + 1][1]);
            int tmp = officalDistance - front - back;
            pq.add(tmp+Math.abs(arr[i - 1][0]-arr[i + 1][0])+Math.abs(arr[i - 1][1]-arr[i + 1][1]));
        }
        System.out.println(pq.poll());

    }
}
