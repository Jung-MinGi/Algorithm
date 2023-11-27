import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    static PriorityQueue<int[]> tmp = new PriorityQueue<>((a, b) -> {
        if (a[0] == b[0]) return b[1] - a[1];
        return b[0]-a[0];
    });
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int len = 0;
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());
            len = Math.max(day, len);
            tmp.add(new int[]{price, day});
        }
        arr = new int[len + 1];
        int sum=0;
        while (!tmp.isEmpty()) {
            int[] poll = tmp.poll();
            for(int i=poll[1];i>=1;i--){
               if(arr[i]==0){
                   arr[i]=poll[0];
                   sum+=arr[i];
                   break;
               }
            }

        }
        System.out.println(sum);
    }
}


