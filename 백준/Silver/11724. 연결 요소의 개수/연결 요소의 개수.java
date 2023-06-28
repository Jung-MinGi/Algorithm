import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int cnt=0;
    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        graph = new ArrayList<>();
        for(int i=0 ; i<n+1; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        boolean[] visit = new boolean[n+1];
        int sum=0;
        for(int i=1; i<visit.length; i++){
            if(visit[i]){
                continue;
            }

            sum+=bfs(i,visit);
        }
        System.out.println(sum);
    }
    static int bfs(int idx,boolean[] visit){

        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        visit[idx]=true;
        while(!q.isEmpty()){
            Integer poll = q.poll();
            int size = graph.get(poll).size();
            for(int i=0; i<size; i++){
                Integer a = graph.get(poll).get(i);
                if(visit[a]){
                    continue;
                }
                visit[a]=true;
                q.add(a);

            }

        }
        return 1;
    }
}

