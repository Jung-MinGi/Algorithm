import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        while(a-->0){
            HashSet<Character> set = new HashSet<>();
            String s = br.readLine();
            for(int i=0;i<s.length();i++)set.add(s.charAt(i));
            System.out.println(set.size());
        }
    }
}
