import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       while(true){
           StringTokenizer st = new StringTokenizer(br.readLine());
           String name = st.nextToken();
           int age = Integer.parseInt(st.nextToken());
           int weight = Integer.parseInt(st.nextToken());
            if(name.equals("#"))break;
           System.out.println(name+" "+((age>17||weight>=80)?"Senior":"Junior"));
       }
    }
}


