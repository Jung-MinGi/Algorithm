import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {
    static boolean[][] arr = new boolean[1001][1001];
    static StringTokenizer st;
    static int n, m;

    static class Node {
        int clipBoard;
        int num;
        int answer;

        public Node(int clipBoard, int num, int answer) {
            this.clipBoard = clipBoard;
            this.num = num;
            this.answer = answer;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dfs();
    }

    static void dfs() {
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(0, 1, 0));
        arr[0][1] = true;
        while (!q.isEmpty()) {
            Node poll = q.poll();
            if(poll.num == n){
                System.out.println(poll.answer);
                return;
            }

            q.offer(new Node(poll.num,poll.num,poll.answer+1));
            //-1
            if(poll.num-1!=-1 && !arr[poll.clipBoard][poll.num-1] ){
                q.offer(new Node(poll.clipBoard,poll.num-1,poll.answer+1));
                arr[poll.clipBoard][poll.num-1]=true;
            }

            //화면에 붙여넣기
            if(poll.num+ poll.clipBoard<=n &&poll.clipBoard!=0 &&!arr[poll.clipBoard][poll.clipBoard+ poll.num] ){
                q.offer(new Node(poll.clipBoard, poll.clipBoard+ poll.num, poll.answer+1));
                arr[poll.clipBoard][poll.num+ poll.clipBoard]=true;
            }
        }
    }
}