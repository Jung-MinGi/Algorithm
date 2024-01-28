import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static PriorityQueue<String> pq = new PriorityQueue<>();
    static boolean[] visit;
    static int[] arr = new int[3];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
//        System.out.println(s.substring(-1,0));
        visit = new boolean[s.length()];
//        if(s.length()==3){
//            StringBuilder sb = new StringBuilder(s);
//            pq.add(s);
//            pq.add(sb.reverse().toString());
//            System.out.println(pq.poll());
//            return;
//        }
        recursive(0,0, s);
        System.out.println(pq.poll());
    }

    static void recursive(int idx,int depth, String str) {
        if (depth == 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(reverseStr(str.substring(0,arr[1])));
            sb.append(reverseStr(str.substring(arr[1], arr[2])));
            sb.append(reverseStr(str.substring(arr[2])));
            pq.add(sb.toString());
            return;
        }

        for (int i = idx; i < str.length(); i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i;
                recursive(i+1,depth + 1, str);
                visit[i] = false;
                arr[depth] = -1;
            }
        }
    }

    static String reverseStr(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}