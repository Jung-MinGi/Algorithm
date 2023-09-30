import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static Node[] visit = new Node[100001];
    static StringTokenizer st;
    static int n, m;
static int min=Integer.MAX_VALUE;
    static class Node {
        int num;
        int cnt;


        public Node(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        dfs(n);
        System.out.println(min);
    }

    static void dfs(int n) {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(n, 0));
//        q.offer(new Node(-1,-1));
        visit[n] = new Node(n, 0);
        while (!q.isEmpty()) {
            Node poll = q.poll();
            if (poll.num == m) {
                min = Math.min(poll.cnt, min);
                continue;
            }

            if (poll.num - 1 >= 0) {
                if(visit[poll.num-1]==null){
                    q.offer(new Node(poll.num-1, poll.cnt+1));
                    visit[poll.num-1]=new Node(poll.num-1, poll.cnt+1);
                }else{
                    if(visit[poll.num-1].cnt> poll.cnt+1){
                        q.offer(new Node(poll.num-1, poll.cnt+1));
                        visit[poll.num-1]=new Node(poll.num-1,poll.cnt+1);
                    }

                }
            }
            if (poll.num + 1 <= m) {
                if(visit[poll.num+1]==null){
                    q.offer(new Node(poll.num+1, poll.cnt+1));
                    visit[poll.num+1]=new Node(poll.num +1, poll.cnt+1);
                }else{
                    if(visit[poll.num+1].cnt > poll.cnt+1){
                        q.offer(new Node(poll.num+1, poll.cnt+1));
                        visit[poll.num+1]=new Node(poll.num +1, poll.cnt+1);
                    }
                }
            }
            if (poll.num * 2 <= m+1) {
                if(visit[poll.num*2]==null){
                    q.offer(new Node(poll.num*2, poll.cnt));
                    visit[poll.num*2]=new Node(poll.num*2, poll.cnt);
                }else{
                    if(visit[poll.num*2].cnt>poll.cnt){
                        q.offer(new Node(poll.num*2, poll.cnt));
                        visit[poll.num*2]=new Node(poll.num*2, poll.cnt);
                    }
                }
            }
        }
    }
}