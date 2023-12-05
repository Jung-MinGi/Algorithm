import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Math.sqrt(Long.parseLong(br.readLine()));
        System.out.printf("%.8f",a*4);
    }
}



