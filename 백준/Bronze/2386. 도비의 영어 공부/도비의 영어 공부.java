import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String alphabet = st.nextToken();
            if (alphabet.equals("#")) break;
            String sentence = st.nextToken();
            while(st.hasMoreElements())sentence+=st.nextToken();
            sentence = sentence.toLowerCase();
            int cnt = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (alphabet.equals(String.valueOf(sentence.charAt(i)))) cnt++;
            }
            sb.append(alphabet).append(" ").append(cnt).append('\n');
        }
        System.out.println(sb);
    }
}

