import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =7;
        ArrayList<Integer>  odd = new ArrayList<>();
        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            if(a%2==1)odd.add(a);
        }
        if(odd.isEmpty()) System.out.println(-1);
        else{
            Collections.sort(odd);
            int sum=0;
            for (Integer i : odd) {
                sum+=i;
            }
            System.out.println(sum);
            System.out.println(odd.get(0));
        }
    }
}
