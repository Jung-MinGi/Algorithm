import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static Node[] arr;
    static double answer = 0.0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new Node[n];
        for(int i=0;i<arr.length;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
           arr[i]=new Node(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        backTracking(0,new boolean[n],0,new Node[n]);
        System.out.println(answer);
    }
    static void backTracking(int idx, boolean[] visit, int depth, Node[] choice){
        if(depth==3){
            answer = Math.max(soultion(choice[0],choice[1],choice[2]),answer);
            return;
        }
        for(int i=idx;i<visit.length;i++){
            if(!visit[i]){
                visit[i]=true;
                choice[depth]=arr[i];
                backTracking(i+1,visit,depth+1,choice);
                choice[depth]=null;

                visit[i]=false;

            }
        }
    }
    static double soultion(Node node1,Node node2,Node node3){
        int a = node1.x * node2.y + node2.x * node3.y + node3.x * node1.y;
        int b = node1.y * node2.x + node2.y * node3.x + node3.y * node1.x;
        return (Math.abs(a - b)) / (double)2;
    }
    static class Node{
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
