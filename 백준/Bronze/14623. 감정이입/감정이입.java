import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(br.readLine()).reverse();
        int a = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') continue;
            a += (int) Math.pow(2, i);
        }
        sb = new StringBuilder(br.readLine()).reverse();
        int b = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '0') continue;
            b += (int) Math.pow(2, i);
        }
        System.out.println(Long.toBinaryString((long) a * b));
    }
}
