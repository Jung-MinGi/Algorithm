import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int cnt=0;
    static ArrayList<ArrayList<Integer>> graph;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        graph = new ArrayList<>();
        for(int i=0 ; i<n+1; i++){
            graph.add(new ArrayList<>());
        }
        StringTokenizer st;

        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        System.out.println(dfs(1));

    }
   static int dfs(int idx){
        boolean[] visit = new boolean[n+1];
        Stack<Integer> stack = new Stack<>();
        stack.add(idx);
        visit[idx]=true;
        while(!stack.isEmpty()){
            Integer pop = stack.pop();
            int size = graph.get(pop).size();
            for(int i=0; i<size; i++){
                Integer a = graph.get(pop).get(i);
                if(visit[a]){
                    continue;
                }
                visit[a]=true;
                stack.add(a);
                cnt++;
            }

        }
        return cnt;
    }
}

