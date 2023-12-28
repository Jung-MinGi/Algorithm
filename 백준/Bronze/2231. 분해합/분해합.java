import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int i = 1; i < Integer.parseInt(s); i++) {
            int result = soultion(String.valueOf(i));
            if(result==Integer.parseInt(s)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

    static int soultion(String n) {
        String tmp = n;
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - 48;
        }
        sum += Integer.parseInt(tmp);
        return sum;
    }
}
