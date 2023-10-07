import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    static int n;
    static ArrayList<Node>[] tree;
    static boolean[] visit = new boolean[0];
    static StringTokenizer st;
    static int max = Integer.MIN_VALUE;

    static class Node {
        int data;
        int weight;

        public Node(int data, int weight) {
            this.data = data;
            this.weight = weight;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tree = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = Integer.parseInt(st.nextToken());
            int child = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            tree[parent].add(new Node(child, weight));
            tree[child].add(new Node(parent, weight));
        }

        for (int i = 1; i <= n; i++) {
            visit = new boolean[n + 1];
            dfs(i, 0);
        }
        System.out.println(max);
    }
    static void dfs(int idx, int sum) {
        visit[idx] = true;
        for (Node node : tree[idx]) {
            if (!visit[node.data]) {
                dfs(node.data, sum + node.weight);
            }
        }
        max = Math.max(max, sum);
    }
}