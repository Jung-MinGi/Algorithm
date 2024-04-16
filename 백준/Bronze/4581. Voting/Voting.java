import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String s = br.readLine();
            if (s.equals("#")) break;
            int  y=0;
            int  n=0;
            int  p=0;
            int  a=0;
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                switch (c){
                    case 'Y':
                        y++;
                        break;
                    case 'N':
                        n++;
                        break;
                    case 'P':
                        p++;
                        break;
                    case 'A':
                        a++;
                        break;
                }
            }
            if(s.length()%2==0&&s.length()/2<=a)sb.append("need quorum").append('\n');
            else if(s.length()%2==1&&s.length()/2<a)sb.append("need quorum").append('\n');
            else{
                if(y>n)sb.append("yes").append('\n');
                else if(y<n)sb.append("no").append('\n');
                else sb.append("tie").append('\n');
            }
        }
        System.out.println(sb);
    }
}
