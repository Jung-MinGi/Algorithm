import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n, m;
    static Integer[] arr = new Integer[100001];

    static class Node {
        int x;
        Integer preNode;

        public Node(int x) {
            this.x = x;
        }

        public Node(int x, int preNode) {
            this.x = x;
            this.preNode = preNode;
        }

        public int getX() {
            return x;
        }

        public int getPreNode() {
            return preNode;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        boolean[] visit = new boolean[100001];
        visit[n] = true;
        arr[n]=-1;
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(n));
        while (!q.isEmpty()) {
            Node poll = q.poll();
            if (poll.getX() + 1 < arr.length && !visit[poll.getX() + 1]) {
                visit[poll.getX() + 1] = true;
                arr[poll.getX()+1]=poll.getX();
                q.add(new Node(poll.getX() + 1, poll.getX()));
            }
            if (poll.getX() - 1 >= 0 && !visit[poll.getX() - 1]) {
                visit[poll.getX() - 1] = true;
                arr[poll.getX() - 1]=poll.getX();
                q.add(new Node(poll.getX() - 1, poll.getX()));
            }
            if (poll.getX() * 2 < arr.length && !visit[poll.getX() * 2]) {
                visit[poll.getX() * 2] = true;
                arr[poll.getX() * 2] = poll.getX();
                q.add(new Node(poll.getX() * 2, poll.getX()));
            }
        }
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(m);
        while(true){
            if(m==n){
                break;
            }
            deque.addLast(arr[m]);
            m=arr[m];
        }
        StringBuilder sb = new StringBuilder();
        System.out.println(deque.size()-1);
       while(!deque.isEmpty()){
          sb.append(deque.pollLast()).append(' ');
       }
        System.out.print(sb);
    }
}
