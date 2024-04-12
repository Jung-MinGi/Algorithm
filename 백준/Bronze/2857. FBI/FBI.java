import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[5];
        for (int i = 0; i < 5; i++) str[i] = br.readLine();
        int cnt=0;
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            cnt++;
            int length = s.length();
            s = s.replaceAll("FBI", "");
            if(s.length()!=length)sb.append(cnt).append(' ');
        }
        if(sb.length()==0) System.out.println("HE GOT AWAY!");
        else System.out.println(sb);
    }
}
