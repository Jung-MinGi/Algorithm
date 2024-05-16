import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = Integer.toBinaryString(Integer.parseInt(br.readLine()));
        for (int i = s.length()-1; i>=0; i--) {
            if(s.charAt(i)=='0')continue;
            System.out.print(Math.abs(i-(s.length()-1))+" ");
        }
    }

}
