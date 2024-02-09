import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        if (n == 0) System.out.println(1);
        else if (n == 1) System.out.println(0);
        else {
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < n / 2; i++) {
                str.append(8);
            }
            if(n%2!=0){
                System.out.println(4+str.toString());
            }else System.out.println(str);
        }

    }
}
