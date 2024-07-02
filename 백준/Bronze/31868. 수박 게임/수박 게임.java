import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken())-1;
        int m = Integer.parseInt(st.nextToken());
//        double m = Double.parseDouble(st.nextToken());
        if(m==1){
            System.out.println(0);
            return;
        }

        while (n-- > 0) {
//            m = Math.ceil(m / 2.0);
            m = (m / 2);
        }
        System.out.println((int) m);
    }

}