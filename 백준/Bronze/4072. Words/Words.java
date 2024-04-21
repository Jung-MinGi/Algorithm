import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
        while(true){
           StringTokenizer st = new StringTokenizer(br.readLine());
           boolean flag=false;
           while(st.hasMoreTokens()){
               String str = st.nextToken();
               if(str.equals("#")){
                   flag=true;
                   break;
               }
               StringBuilder s = new StringBuilder(str);
               sb.append(s.reverse()).append(' ');
           }
           if(flag)break;
           sb.append('\n');
       }
        System.out.println(sb);
    }
}
