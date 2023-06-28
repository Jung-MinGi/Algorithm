import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int idx = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
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
        for(int i=1; i<graph.size(); i++){
            Collections.sort(graph.get(i), new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
        }
        boolean[] visit = new boolean[n + 1];

        dfs(idx,visit);
        StringBuilder sb = new StringBuilder();
        for (int i=1; i<arr.length; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);

    }
    static void dfs(int idx,boolean[] visit) {
        int cnt=1;
        Stack<Integer> stack = new Stack<>();
        stack.add(idx);
        visit[idx] = true;
        while (!stack.isEmpty()) {
            Integer pop = stack.pop();

            visit[pop]=true;
            if(arr[pop]==0){

                arr[pop]=cnt;
                cnt++;
            }
            int size = graph.get(pop).size();
            for (int i = 0; i < size; i++) {
                Integer num = graph.get(pop).get(i);
                if (visit[num]) {
                    continue;
                }
                stack.add(num);
//                visit[num] = true;
            }
        }
    }
}

