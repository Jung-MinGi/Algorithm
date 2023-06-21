import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        //노드 개수
        int n = Integer.parseInt(st.nextToken());
        //간선 개수
        int k = Integer.parseInt(st.nextToken());
        //탐색시작 노드 번호
        int v = Integer.parseInt(st.nextToken());
        //노드 방문 여부 확인 배열
        boolean[] visited = new boolean[n+1];
        for (int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);

        }
        for (ArrayList<Integer> list : graph) {
            Collections.sort(list,Collections.reverseOrder());
        }
        System.out.println(dfs(v,graph,visited));
        visited = new boolean[n+1];
        for (ArrayList<Integer> list : graph) {
            Collections.sort(list);
        }
        System.out.println(bfs(v,graph,visited));

    }
   public static String bfs(int v, ArrayList<ArrayList<Integer>> list, boolean[] visit){
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        visit[v]=true;
       StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            Integer poll = q.poll();
            sb.append(poll).append(" ");
                for(int i=0; i<list.get(poll).size(); i++){
                    Integer a = list.get(poll).get(i);
                    if(!visit[a]){
                        q.add(a);
                        visit[a]=true;
                    }
            }
        }
    return sb.toString();
    }

    public static String dfs(int v, ArrayList<ArrayList<Integer>> list, boolean[] visit){
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            Integer pop = stack.pop();
            if(visit[pop]){
                continue;
            }
            visit[pop] = true;
            sb.append(pop+" ");
            for(int i=0; i<list.get(pop).size(); i++){
                stack.push(list.get(pop).get(i));
            }
        }
    return sb.toString();
    }
}