import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       while(true){
           boolean flag=true;
           StringTokenizer st = new StringTokenizer(br.readLine());
           int cnt=0;
           while(st.hasMoreTokens()){
               String s = st.nextToken().toLowerCase();
               for(int i=0;i<s.length();i++){
                   char c = s.charAt(i);
                   if(c =='a'||c=='e'||c=='i'||c=='o'||c=='u')cnt++;
                   if(c=='#'){
                       flag=false;
                       break;
                   }
               }
           }
           if(flag) System.out.println(cnt);
           if(!flag)break;
       }
    }
}
