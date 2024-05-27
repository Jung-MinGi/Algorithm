import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Math.sqrt((double) Integer.parseInt(br.readLine()) / 2);
        System.out.println((int) (a * 2) * 4);
    }
}
