import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        String s = br.readLine();
        for(int i=1;i<s.length();i+=2){
            char c = s.charAt(i);
            if(i+1==s.length())break;
            char v = s.charAt(i+1);
            if(v==c){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
