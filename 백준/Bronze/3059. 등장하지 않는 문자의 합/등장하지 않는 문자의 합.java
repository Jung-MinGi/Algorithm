import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            boolean[] check = new boolean[26];
            String s = br.readLine();
            int total = 2015;
            for (int i = 0; i < s.length(); i++) {
                int a = s.charAt(i);
               if(!check[s.charAt(i)-'A']) total-=a;
                check[s.charAt(i)-'A']=true;
            }
            System.out.println(total);
        }

    }
}
