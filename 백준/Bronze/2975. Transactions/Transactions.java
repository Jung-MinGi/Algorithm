import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       while(true){
           StringTokenizer st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           String s = st.nextToken();
           int b = Integer.parseInt(st.nextToken());
            if(a==0&&s.equals("W")&&b==0)break;
           if(s.equals("W")){
               System.out.println((a-b)<-200?"Not allowed":a-b);
           }else System.out.println(a+b);
       }
    }
}

