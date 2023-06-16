import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
           priorityQueue.offer(Long.parseLong(st.nextToken()));
        }
        while(m-->0){
            Long a = priorityQueue.poll();
            Long b = priorityQueue.poll();
            priorityQueue.offer(a+b);
            priorityQueue.offer(b+a);
            }
        long sum=0;
        while (!priorityQueue.isEmpty()) {
            sum += priorityQueue.poll();
        }
        System.out.println(sum);
    }
}