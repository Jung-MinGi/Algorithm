import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static class Node {
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
        Node current = node;

        if (current == null) {
            root = new Node(k);
            return root;
        }

        Node currentParent;
        do {
            currentParent = current;
            if (current.key < k) {
                current = current.right;
            } else {
                current = current.left;
            }
        } while (current != null);
        Node tmp = new Node(k);
        if (currentParent.key < k) {
            currentParent.right = tmp;
        } else {
            currentParent.left = tmp;
        }
        return tmp;
    }
}
