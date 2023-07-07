import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
                pq.offer(Long.valueOf(br.readLine()));
        }
        Long answer=0L;
        if(pq.size()>1){
            while(!pq.isEmpty()){
                Long a = pq.poll();
                Long b = pq.poll();
                Long temp = a+b;
                answer+=temp;
                if(pq.size()!=0){
                    pq.offer(temp);
                }
            }
        }

        System.out.println(answer);
    }

}


