import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        while (st.hasMoreElements()) pq.add(Integer.parseInt(st.nextToken()));
        int sum=0;
        if(n==1) {
            System.out.println(pq.poll());
            return;
        }
        while(!pq.isEmpty()){
            Integer pre = pq.poll();
            Integer post = pq.poll();
            sum+=pre+post;
            if(pq.isEmpty())break;
            pq.add(pre);
        }
        System.out.println(sum);
    }
}


