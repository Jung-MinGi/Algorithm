import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int k =Integer.parseInt(st.nextToken());
        int min=9;
        while(true){
            String s = String.valueOf(n);
            int cnt=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='8')cnt++;
            }
            min = Math.min(cnt,min);
            if(min==0)break;
            n+=1;
            if(n==k+1)break;
        }
        System.out.println(min);
    }
}
