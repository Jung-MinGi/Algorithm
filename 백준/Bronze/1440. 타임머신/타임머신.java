import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        int answer=0;
        int a = Integer.parseInt(st.nextToken());
        if(a>=1&&12>=a)answer+=2;
        int b = Integer.parseInt(st.nextToken());
        if(b>=1&&12>=b)answer+=2;
        int c = Integer.parseInt(st.nextToken());
        if(c>=1&&12>=c)answer+=2;
        if(a>59||b>59||c>59) System.out.println(0);
        else System.out.println(answer);
    }
}
