import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static char[][] a = new char[26][26];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      init();
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = br.readLine();
            if(s.equals("0"))break;
            String t = br.readLine();
            int x=0;
            int y=0;
            for (int i = 0; i < t.length(); i++) {
                if(s.length()<=x)x=0;

                sb.append(a[s.charAt(x)-'A'][t.charAt(i)-'A']);
                x++;
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static void init() {
            for(int i=0;i<26;i++){
                char c = (char)('B'+i);
                if(i==25)c='A';
                for (int j = 0; j < 26; j++) {
                    a[i][j]=c;
                    if(c=='Z'){
                        c='A';
                        continue;
                    }
                    c++;
                }
            }
    }
}
