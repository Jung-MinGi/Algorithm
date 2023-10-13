import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n, m;
    static ArrayList<Integer> list = new ArrayList<>();
    static Integer[] dp;
    static boolean[] visit;
    static int max = Integer.MIN_VALUE;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        dp = new Integer[n - 2];
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        backTracking(0, list);
 System.out.println(max);
    }

    static void backTracking(int sum,ArrayList<Integer> list) {
        if (list.size() == 2) {
            max = Math.max(max, sum);
           
            return;
        }
     for(int i=1; i<list.size()-1; i++){
         int tmp = list.get(i);
         int num = list.get(i-1)*list.get(i+1);
         list.remove(i);
         backTracking(sum+num,list);
         list.add(i,tmp);
     }

    }

}
