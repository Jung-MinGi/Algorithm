import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


class Main {
    static ArrayList<Node>[] tree;
    static boolean[] visit;
    static int max = 0;

    static class Node {
        int data;
        int val;

        public Node(int data, int val) {
            this.data = data;
            this.val = val;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        tree = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            tree[a].add(new Node(b, c));
            tree[b].add(new Node(a, c));
        }

        for (int i = 1; i <= n; i++) {
            visit = new boolean[n + 1];
            dfs(0, i);
        }
        System.out.println(max);

    }

    static void dfs(int sum, int n) {
        visit[n] = true;

        for (Node node : tree[n]) {
            if (!visit[node.data]) {
                dfs(sum + node.val, node.data);
            }
        }
        max = Math.max(max, sum);
    }
}
