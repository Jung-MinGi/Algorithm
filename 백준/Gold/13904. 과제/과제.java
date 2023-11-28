import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        int max = Integer.MIN_VALUE;
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            max = Math.max(day, max);
            pq.add(new int[]{day, Integer.parseInt(st.nextToken())});
        }
        int answer=0;
        arr = new int[max + 1];
        while(!pq.isEmpty()){
            int[] poll = pq.poll();
            for(int i=poll[0];i>0;i--){
                if(arr[i]==0){
                    answer+=poll[1];
                    arr[i]=poll[1];
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}


