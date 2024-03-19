import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int[] arr;
    static int[] dx = new int[]{1, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            list.add(new int[]{arr[i], i});
        }
        Collections.sort(list, (int[] a, int[] b) -> b[0] - a[0]);
        ArrayList<Integer> li = new ArrayList<>();
        boolean[] visit = new boolean[n];
        for (int[] ints : list) {
            if (visit[ints[1]]) continue;
            li.add(ints[1]);
            bfs(ints[1], visit);
        }
        Collections.sort(li);
        for (Integer i : li) {
            System.out.println(++i);
        }
        //        for (int i = 0; i < n; i++) {
//
//            bfs(i, visit);
//            list.add(i);
//            for (int j = 0; j < n; j++) {
//                if (visit[j]) continue;
//                list.add(j);
//                bfs(j,visit);
//            }
//            System.out.println(list);
//        }

    }

    static void bfs(int idx, boolean[] visit) {
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        visit[idx] = true;
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            for (int i = 0; i < 2; i++) {
                int nx = poll + dx[i];
                if (nx < 0 || nx >= arr.length) continue;
                if (visit[nx]) continue;
                if (arr[poll] <= arr[nx]) continue;
                q.add(nx);
                visit[nx] = true;
            }
        }
    }
}
