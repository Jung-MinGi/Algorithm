import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        while ((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str);
            int n = Integer.parseInt(st.nextToken());//치킨쿠폰
            int k = Integer.parseInt(st.nextToken());//쿠폰되기위한 도장개수
            int answer = 0;
            int stamp=0;
            while (true) {
                answer += n ;
                stamp += n;
                n = stamp/k;
                if(n==0)break;
                stamp=stamp-n*k;
            }
            System.out.println(answer);
        }
    }
}

