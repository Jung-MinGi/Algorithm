import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        int a = 0;
        while ((s = br.readLine()) != null) {
            a++;
        }
        System.out.println(a);
    }
}
