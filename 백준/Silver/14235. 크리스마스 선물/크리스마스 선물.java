import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int a = Integer.parseInt(st.nextToken());
                if(a==0 && pq.isEmpty()) sb.append(-1).append('\n');
                if(a!=0){
                    for(int i=0; i<a; i++){
                        int b = Integer.parseInt(st.nextToken());
                        pq.offer(b);
                    }
                }
                if(a==0 && !pq.isEmpty()){
                    sb.append(pq.poll()).append('\n');
                }

            }
        }
        System.out.println(sb);
    }
}

