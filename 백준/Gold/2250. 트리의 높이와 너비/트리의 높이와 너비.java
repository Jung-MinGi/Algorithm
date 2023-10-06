import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static ArrayList<Node> list = new ArrayList<>();
    static StringTokenizer st;
    static int n;
    static int[] min, max;
    static int columnLevel = 1;

    static class Node {
        int parent;
        int data;
        int left;
        int right;


        public Node(int data, int left, int right) {
            parent = -1;
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        min = new int[n + 1];
        max = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            list.add(new Node(i, -1, -1));
            min[i] = n;
            max[i] = 0;
        }

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int data = Integer.parseInt(st.nextToken());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            Node node = list.get(data);
            node.data = data;
            node.left = left;
            node.right = right;
            if (left != -1) list.get(left).parent = data;
            if (right != -1) list.get(right).parent = data;
        }
        int root = 0;
        for (int i = 1; i <= n; i++) {
            if (list.get(i).parent == -1) {
                root = i;
                break;
            }
        }
        inOrder(root, 1);
        int lev=1;
        int len=0;
        for(int i=1; i<=n; i++){
            if(max[i]-min[i]>len){
                len=max[i]-min[i];
                lev=i;
            }
        }
        System.out.println(lev+" "+(len+1));
    }

    static void inOrder(int nodeNum, int level) {
        Node node = list.get(nodeNum);
        if(node.left!=-1){
            inOrder(node.left,level+1);
        }
        min[level]=Math.min(min[level],columnLevel);
        max[level]=Math.max(max[level],columnLevel);
        columnLevel++;
        if(node.right!=-1){
            inOrder(node.right,level+1);
        }
    }
}
