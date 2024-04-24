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
            char parity = s.charAt(s.length() - 1);
            int one=0;
            int zero=0;
            for(int i=0;i<s.length()-1;i++){
                char c = s.charAt(i);
                sb.append(c);
               switch (c){
                   case '1':
                      one++;
                       break;
                   case '0':
                       zero++;
                       break;

               }
            }
            if(parity=='o'){
                if(one%2==1)sb.append(0);
                else sb.append(1);
            }else{
                if(one%2==1)sb.append(1);
                else sb.append(0);
            }
            System.out.println(sb);}
    }
}
