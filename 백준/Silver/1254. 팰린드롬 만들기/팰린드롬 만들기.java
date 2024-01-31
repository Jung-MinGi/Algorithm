import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] paper = new int[]{0, 5, 5, 5, 5, 5};
    static int n;
    static int[][] arr = new int[10][10];
    static int k;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String reverseS = new StringBuilder(s).reverse().toString();
        if (s.equals(reverseS)) {
            System.out.println(s.length());
            return;
        }
        int cnt = 1;
        for (int j = 0; j < s.length(); j++) {
            if (reverseS.charAt(0) == s.charAt(j)) {
                cnt = 1;
                boolean flag = false;
                for (int k = j + 1; k < s.length(); k++) {
                    if (reverseS.charAt(cnt) != s.charAt(k)) {
                        flag = true;
                        break;
                    }
                    cnt++;
                }
                if (!flag) break;
            }
        }
        System.out.println(2*s.length()-cnt);
    }

}