import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    static int n, m;
    static PriorityQueue<Character> pq = new PriorityQueue<>((a,b)->b.compareTo(a));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        int sum =0;
        boolean flag = false;
        for (char c : arr) {
            if(c=='0')flag=true;
            sum+=(c-48);
            pq.add(c);
        }
        StringBuilder sb;
        if(flag&&sum%3==0){
             sb = new StringBuilder();
            while(!pq.isEmpty()){
                sb.append(pq.poll());
            }
            System.out.println(sb.toString());
            return;
        }
        System.out.println(-1);
    }
}


