import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double[] a = new Double[10];
        for (int i = 0; i < 10; i++) {
            a[i] = Double.parseDouble(br.readLine());
        }

        Arrays.sort(a);

        int k=1;
        double answer=1;
        for (int i = a.length-1; i >0 ; i--) {
            answer*=a[i]/k;
            k++;
        }
        System.out.printf("%.6f",answer*(Math.pow(10,9)));
    }
}
