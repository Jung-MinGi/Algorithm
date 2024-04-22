import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String s = br.readLine();
            sb.append(s).append(" is ");
            StringTokenizer st = new StringTokenizer(s);
            int g=0;
            int b=0;
            while(st.hasMoreTokens()){
                String str = st.nextToken().toLowerCase();
                for(int i=0;i<str.length();i++){
                    char c = str.charAt(i);
                    if(c=='g')g++;
                    else if(c=='b')b++;
                }
            }
            if(g>b)sb.append("GOOD");
            else if(g<b)sb.append("A BADDY");
            else sb.append("NEUTRAL");
            sb.append('\n');
        }
        System.out.println(sb);}

}
