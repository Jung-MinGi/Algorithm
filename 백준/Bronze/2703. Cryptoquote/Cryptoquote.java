import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            char[] arr = new char[26];
            String s = br.readLine();
            String cryptoquote = br.readLine();
            for (int i = 0; i < 26; i++) arr[i] = cryptoquote.charAt(i);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==' ')sb.append(' ');
                else sb.append(arr[s.charAt(i)-'A']);
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

}

