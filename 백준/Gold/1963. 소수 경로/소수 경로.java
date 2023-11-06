import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static boolean[] prime = new boolean[10000];
    static int n;
    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        primeNumber();
        n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            answer = Integer.MAX_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine());
            bfs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            System.out.println((answer == Integer.MAX_VALUE) ? "Impossible" : answer);
        }
    }

    static void primeNumber() {
        for (int i = 2; i < Math.sqrt(10000); i++) {
            for (int j = i * i; j < 10000; j += i) {
                prime[j] = true;
            }
        }
    }

    static void bfs(int x, int target) {
        boolean[] visit = new boolean[10000];
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, 0));
        visit[x] = true;
        while (!q.isEmpty()) {
            Node poll = q.poll();
            if(poll.num==target){
                answer = Math.min(answer,poll.cnt);
                continue;
            }
            for (int i = 9; i >= 0; i--) {
                if (i != poll.get1()) {
                    int tmp = i*1000 + poll.get2() * 100 + poll.get3() * 10 + poll.get4();
                    if(tmp>=1000&&!visit[tmp]&&!prime[tmp]){
                        visit[tmp]=true;
                        q.add(new Node(tmp,poll.cnt+1));
                    }
                }
                if (i != poll.get2()) {
                    int tmp = poll.get1() * 1000 + i * 100 + poll.get3() * 10 + poll.get4();
                    if(tmp>=1000&&!visit[tmp]&&!prime[tmp]){
                        visit[tmp]=true;
                        q.add(new Node(tmp,poll.cnt+1));
                    }
                }
                if (i != poll.get3()) {
                    int tmp = poll.get1() * 1000 + poll.get2() * 100 + i * 10 + poll.get4();
                    if(tmp>=1000&&!visit[tmp]&&!prime[tmp]){
                        visit[tmp]=true;
                        q.add(new Node(tmp,poll.cnt+1));
                    }
                }
                if (i != poll.get4()) {
                    int tmp = poll.get1() * 1000 + poll.get2() * 100 + poll.get3() * 10 + i;
                    if(tmp>=1000&&!visit[tmp]&&!prime[tmp]){
                        visit[tmp]=true;
                        q.add(new Node(tmp,poll.cnt+1));
                    }
                }
            }
        }

    }

    static class Node {
        public int num;
        public int cnt;

        public Node(int num, int cnt) {
            this.num = num;
            this.cnt = cnt;
        }

        public int get1() {
            return num / 1000;
        }

        public int get2() {
            return (num % 1000) / 100;
        }

        public int get3() {
            return (num % 100) / 10;
        }

        public int get4() {
            return num % 10;
        }
    }

}