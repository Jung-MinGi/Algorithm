import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine();
            arr[s.charAt(0) - 'a']++;
        }
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {

            if (arr[i] > 4) list.add((char) (i + 'a'));
        }
        if (list.isEmpty()) {
            System.out.println("PREDAJA");
        } else {
            Collections.sort(list);
            for (Character c : list) {
                System.out.print(c);
            }
        }
    }
}
