import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] arr;
    static boolean[] visit;
    static ArrayList<Integer> dp;
    static int n, m, k;
    static boolean flag = false;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());//간선정보
        k = Integer.parseInt(st.nextToken());//시작 정점
        dp = new ArrayList<>();
        arr = new ArrayList[n + 1];
        visit = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        for (ArrayList<Integer> integers : arr) {
           if(integers!=null)Collections.sort(integers);
        }
        dfs(k);
        sb.append('\n');
        visit = new boolean[n + 1];
        bfs(k);
        System.out.println(sb);
    }

    static void bfs(int index) {
        Queue<Integer> q = new LinkedList<>();
          visit[index]=true;
        q.add(index);
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            sb.append(poll).append(' ');
            for (int i = 0; i < arr[poll].size(); i++) {
                Integer a = arr[poll].get(i);
                if(!visit[a]){
                    q.add(a);
                    visit[a]=true;
                }
            }
        }
    }

    static void dfs(int index) {
        sb.append(index).append(' ');
        visit[index] = true;
        for (int i = 0; i < arr[index].size(); i++) {
            Integer a = arr[index].get(i);
            if (!visit[a]) {
                dfs(a);
            }
        }
    }
}