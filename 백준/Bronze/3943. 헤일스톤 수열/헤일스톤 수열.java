import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc=Integer.parseInt(br.readLine());
        while(tc-->0) {

//            PriorityQueue<Integer> pq = new PriorityQueue<>((Integer a, Integer b) -> b - a);
            int n = Integer.parseInt(br.readLine());
            int max = n;
            for (int i = n; ; ) {
                if (i == 1) {
                   max=Math.max(i,max);
                    break;
                }
                if (i % 2 == 0) {
                    i = i / 2;
                } else {
                    i = i * 3 + 1;
                }
                max=Math.max(i ,max);
            }
            System.out.println(max);
        }
    }
}
