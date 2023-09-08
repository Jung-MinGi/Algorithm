import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;


public class Main {

    static int[][] arr;
    static Integer[] dp;
    static boolean[] visit = new boolean[10];
    static StringTokenizer st;
    static StringBuilder sb;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        sb = new StringBuilder();
        while (a-- > 0) {
            HashSet<Integer> set = new HashSet<>();
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int j;
            int l;
            if(x<=n){
                 j = x;
                 l = x;
            }else{
                 j = x;
                 if((j%n)==0){
                    l=n;
                 }else{
                     l = j%n;
                 }
            }
            int k = 0;
            int answer=x;
            while (true) {
                  if(l==y){
                      answer+=(k*m);
                      sb.append(answer).append('\n');
                      break;
                  }
                  if(set.contains(l)){
                      sb.append(-1).append('\n');
                      break;
                  }else{
                      set.add(l);
                  }
                  if(l+m>n){
                      int i = l + m;
                      while(i>n){
                          i=Math.abs(i-n);
                      }
                      l=i;
                  }else{
                      l=l+m;
                  }
                k++;
            }
            }
        System.out.println(sb);
    }
}


