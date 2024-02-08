import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Integer[] arr;
    static Integer[] brr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int m =Integer.parseInt(st.nextToken());
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0]-o1[0];
            }
        });
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            pq.add(new int[]{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())});
        }
        int cnt=0;
        int idx=0;
        while(!pq.isEmpty()){
            int[] poll = pq.poll();
            idx++;
            if(poll[0]>=n){
                if(idx==m-1)break;
                continue;
            }
            cnt+=Math.abs(n-poll[1]);
            if(idx==m-1)break;
        }
        System.out.println(cnt);
    }

}
