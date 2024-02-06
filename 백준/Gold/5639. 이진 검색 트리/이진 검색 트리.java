import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static class Node {
        public Node parent;
        public int key;
        public Node left;
        public Node right;


        public Node(int key) {
            this.key = key;
        }
    }

    static Node root;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (true) {
            s = br.readLine();
            if (s == null || s.equals("")) break;
            add(root, Integer.parseInt(s));
        }
        search(root);
    }

    public static void search(Node node) {
        if (node == null) return;
        search(node.left);
        search(node.right);
        System.out.println(node.key);
    }

    public static Node add(Node node, int k) {
        if (root == null) {
            root = new Node(k);
            root.parent = root.left = root.right = null;
            return root;
        }
        if (node == null) {
            node = new Node(k);
            node.left = node.right = null;
            return node;
        }
        Node current = node;

        if (current.key < k) {
            current.right = add(current.right, k);
            return current;
        } else {
            current.left = add(current.left, k);
            return current;
        }


    }
}
