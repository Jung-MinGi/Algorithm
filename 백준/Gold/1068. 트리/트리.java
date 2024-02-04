import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Node[] tree;
    static int n = 0;
    static int root = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        tree = new Node[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new Node(-1, i);
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int parentNodeValue = Integer.parseInt(st.nextToken());
            if (parentNodeValue == -1) {
                Node node = tree[i];
                node.val = i;
                root =i;
                continue;
            }
            Node node = tree[i];
            node.parent = parentNodeValue;
            tree[parentNodeValue].childNode.add(tree[i]);
            tree[i] = node;
        }
        int target = Integer.parseInt(br.readLine());
        Stack<Node> stack = new Stack<>();
        boolean[] visit = new boolean[n];
        Node node = tree[target];

        stack.add(node);
        while (!stack.isEmpty()) {
            Node pop = stack.pop();
            if(target!=root&&tree[pop.parent]!=null&&!tree[pop.parent].childNode.isEmpty()){
                for (int i=0;i<tree[pop.parent].childNode.size();i++) {
                    if(pop.val== node.val){
                        tree[pop.parent].childNode.remove(i);
                        break;
                    }
                }
            }
            visit[pop.val] = true;
            tree[pop.val] = null;
            for (Node node1 : pop.childNode) {
                if (visit[node1.val]) continue;
                tree[node1.val] = null;
                stack.add(node1);
                visit[node1.val] = true;
            }
        }

        int cnt = 0;
        for (Node v : tree) {
            if (v == null) continue;

            if (v.childNode.isEmpty()) cnt++;
        }
        System.out.println(cnt);
    }

    static class Node {
        private int parent;
        private int val;
        private ArrayList<Node> childNode = new ArrayList<>();

        public Node(int parent, int val) {
            this.parent = parent;
            this.val = val;

        }
    }

}