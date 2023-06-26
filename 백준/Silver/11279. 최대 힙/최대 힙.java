import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            if(a==0){
                Integer poll = pq.poll();
                if(poll == null){
                    sb.append(0).append('\n');
                }else{
                    sb.append(poll).append('\n');
                }
            }else{
                pq.add(a);
            }

        }
        System.out.println(sb);
    }
}

