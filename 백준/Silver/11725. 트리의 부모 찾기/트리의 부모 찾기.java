import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    static ArrayList<Integer>[] tree;
    static StringTokenizer st;
    static boolean[] visit;
    static int[] answer;
    static int n;


    static class Node {
        int parent;
        ArrayList<Integer> child;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tree = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        visit = new boolean[n + 1];
        answer = new int[n + 1];
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int data = Integer.parseInt(st.nextToken());
            tree[parent].add(data);
            tree[data].add(parent);
        }
        dfs(1);
         StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            sb.append(answer[i]).append('\n');
        }
        System.out.println(sb);
    }
    static void dfs(int idx) {
        visit[idx]=true;
        for (int i = 0; i < tree[idx].size(); i++) {
            if(!visit[tree[idx].get(i)]){
                answer[tree[idx].get(i)]=idx;
                visit[tree[idx].get(i)]=true;
                dfs(tree[idx].get(i));
            }
        }
    }
}
