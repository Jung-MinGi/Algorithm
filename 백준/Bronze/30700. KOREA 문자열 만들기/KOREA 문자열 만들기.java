import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] korea = new String[]{"K","O","R","E","A"};
        int idx=0;
        int stan=0;
        int cnt=0;
        while(true){
            char c = s.charAt(stan);
            String str = korea[idx];
            if(str.equals(c+"")){
                cnt++;
                idx++;
            }
            stan++;
            if(idx==5)idx=0;
            if(stan == s.length())break;
        }
        System.out.println(cnt);
    }
}
