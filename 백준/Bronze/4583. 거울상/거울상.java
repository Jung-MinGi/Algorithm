import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if(s.equals("#"))break;
            StringBuilder sb = new StringBuilder();
            boolean flag=true;
            for(int i=s.length()-1;i>=0;i--){
                char c = s.charAt(i);
               switch (c){
                   case 'b':
                       sb.append('d');
                       break;
                   case 'd':
                       sb.append('b');
                       break;
                   case 'p':
                       sb.append('q');
                       break;
                   case 'q':
                       sb.append('p');
                       break;
                   case 'i':
                   case 'o':
                   case 'v':
                   case 'x':
                   case 'w':
                       sb.append(c);
                       break;
                   default:
                       flag=false;
                       System.out.println("INVALID");
               }
               if(!flag)break;
            }
            if(flag) System.out.println(sb);
        }
    }
}
