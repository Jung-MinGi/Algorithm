import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-->0) {
            double i=10.0;
            int v = Integer.parseInt(br.readLine());
            while(v>=i){
                long l = (long) (Math.round(v / i) * i);
                v= (int) l;
                i*=10;
            }
            System.out.println(v);
        }
    }
}
