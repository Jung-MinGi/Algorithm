import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    /*

     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        while (x-- > 0) {
            String s = br.readLine();
            int n = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') continue;
                n += s.charAt(i) - 'A';
                n++;
            }
            if (n == 100) System.out.println("PERFECT LIFE");
            else System.out.println(n);
    }}}
