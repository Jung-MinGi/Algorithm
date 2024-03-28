import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visit = new boolean[101];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            br.readLine();
            ArrayList<Integer> s = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            while (x-- > 0) s.add(Integer.parseInt(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            while (y-- > 0) b.add(Integer.parseInt(st.nextToken()));
            Collections.sort(s);
            Collections.sort(b);
            while(!s.isEmpty()&&!b.isEmpty()){
                Integer i = s.get(0);
                Integer p = b.get(0);
                if(i<p)s.remove(0);
                else b.remove(0);
            }
            if(s.isEmpty()&&b.isEmpty()){
                System.out.println("C");
            }else if(s.isEmpty()){
                System.out.println("B");
            }else System.out.println("S");
        }
    }
}
