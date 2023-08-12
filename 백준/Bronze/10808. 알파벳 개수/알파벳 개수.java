import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int[] counting = new int[26];
        String s = br.readLine();
        for(int i=0; i<s.length(); i++){
            counting[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        Arrays.stream(counting).iterator()
                .forEachRemaining((int i)->sb.append(i).append(' '));
        System.out.println(sb);
    }
}
