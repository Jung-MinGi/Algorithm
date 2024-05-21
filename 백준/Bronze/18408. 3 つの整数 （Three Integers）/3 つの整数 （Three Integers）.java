import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = 0;
        int b = 0;
        while (st.hasMoreTokens()){
            if(st.nextToken().equals("1"))a++;
            else b++;
        }
       
        System.out.println((a > b) ? "1" : "2");
    }
}
