import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int s = 0;
        int b = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 's') s++;
            else if (str.charAt(i) == 'b') b++;
        }

        if (s > b) System.out.println("security!");
        else if (s < b) System.out.println("bigdata?");
        else System.out.println("bigdata? security!");
    }
}
