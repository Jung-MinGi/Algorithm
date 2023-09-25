import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static ArrayList<HashSet<Integer>> map;
    static Integer[] answer;
    static boolean[] visit;
    static StringTokenizer st;
    static int n;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new ArrayList<>();
        visit = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            map.add(new HashSet<>());
        }
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map.get(a).add(b);
            map.get(b).add(a);
        }
        answer = new Integer[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            answer[i] = Integer.parseInt(st.nextToken());
        }
        if(answer[1]==1){
            bfs(1);
        }else{
            System.out.println(0);
        }
    }


    static void bfs(int x) {
        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        visit[x] = true;
        int index = 2;

        while (!q.isEmpty()) {
            Integer poll = q.poll();
            int cnt = 0;
            for (Integer i : map.get(poll)) {
                if (!visit[i]) {
                    visit[i] = true;
                    cnt++;
                }
            }
            for (int i = index; i < index + cnt; i++) {
                if (visit[answer[i]]) {
                    q.add(answer[i]);
                } else {
                    System.out.println(0);
                    return;
                }
            }
            index = index + cnt;
        } System.out.println(1);
    }
}