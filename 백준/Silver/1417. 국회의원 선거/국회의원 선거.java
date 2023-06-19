import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o2-o1;
           }
       });
     int n = Integer.parseInt(br.readLine());
     int answer = Integer.parseInt(br.readLine());
     for(int i=0; i<n-1; i++){
         priorityQueue.add(Integer.parseInt(br.readLine()));
     }
     int cnt=0;
     while(priorityQueue.size()>0){
         Integer max = priorityQueue.poll();
         if(max < answer){
             break;
         }
         answer++;
         cnt++;
         priorityQueue.add(max-1);
     }
        System.out.println(cnt);
    }
}