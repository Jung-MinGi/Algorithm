import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static HashMap<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            StringTokenizer st = new StringTokenizer(br.readLine(),"-");
            String s=st.nextToken();
            int b = Integer.parseInt(st.nextToken());
            int a=0;
            for(int i=0;i<s.length();i++){
                int tmp = s.charAt(i) - 'A';
                a+=tmp*(int)Math.pow(26,s.length()-1-i);
            }
            if(Math.abs(a-b)<=100) System.out.println("nice");
            else System.out.println("not nice");
        }
    }
}

