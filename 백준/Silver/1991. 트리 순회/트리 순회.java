import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static String[][] map = new String[0][3];
    static boolean[][] visit = new boolean[0][0];
    static StringTokenizer st;
    static int n, m;
    static int min = Integer.MAX_VALUE;

    static class Node {
        String data;
        Node left;
        Node right;

    }

    static class Tree {
        private Node root;

        public Node getRoot() {
            return root;
        }

        public void setRoot(Node root) {
            this.root = root;
        }

        public Node makeNode(String data, Node left, Node right) {
            Node node = new Node();
            node.data = data;
            node.left = left;
            node.right = right;
            return node;
        }

        public void preOrder(Node node) {
            if (node != null) {
                System.out.print(node.data);
                preOrder(node.left);
                preOrder(node.right);
            }
        }

        public void inOrder(Node node) {
            if (node != null) {
                inOrder(node.left);
                System.out.print(node.data);
                inOrder(node.right);
            }
        }

        public void postOrder(Node node) {
            if (node != null) {
                postOrder(node.left);
                postOrder(node.right);
                System.out.print(node.data);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new String[n][3];
        Tree tree = new Tree();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                map[i][j] = st.nextToken();
            }
        }
        HashMap<String, Node> info = new HashMap<>();
        for (int i = n - 1; i >= 0; i--) {
            String left = null;
            String right = null;
            if (!map[i][1].equals(".")) {
                left = map[i][1];
            }
            if (!map[i][2].equals(".")) {
                right = map[i][2];
            }
            info.put(map[i][0], tree.makeNode(map[i][0], info.get(left), info.get(right)));
        }
        tree.setRoot(info.get("A"));
        tree.preOrder(tree.getRoot());
        System.out.println();
        tree.inOrder(tree.getRoot());
        System.out.println();
        tree.postOrder(tree.getRoot());
    }


}
