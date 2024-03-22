import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
//        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] a, int[] b) {
//                return b[2]-a[2];
//            }
//        });
        ArrayList<int[]> pq = new ArrayList<>();
        while(n-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int country = Integer.parseInt(st.nextToken());
            int number = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            pq.add(new int[]{country,number,score});
        }
        Collections.sort(pq, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[2]-o1[2];
            }
        });
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[99999];
        int idx=0;
        for (int[] ints : pq) {
            int c = ints[0];
            if(arr[c]!=2){
                arr[c]++;
                idx++;
                sb.append(ints[0]).append(" ").append(ints[1]).append('\n');
            }
            if(idx==3)break;
        }
        System.out.println(sb);
    }

}
