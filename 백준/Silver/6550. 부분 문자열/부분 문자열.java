import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a;
        while ((a = br.readLine())!=null) {
            int x=0;
            StringTokenizer st = new StringTokenizer(a);
            StringBuilder s = new StringBuilder(st.nextToken());
            StringBuilder t = new StringBuilder(st.nextToken());
            int idx = 0;
                for (int i = 0; i < t.length(); i++) {
                    if(s.charAt(idx)==t.charAt(i)){
                        idx++;
                    }
                    if(idx==s.length())break;
                }
            if (idx==s.length()) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}