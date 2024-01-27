import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase=Integer.parseInt(br.readLine());
        while(testCase-->0){
            long n = Long.parseLong(br.readLine());
            while (true) {
                long a = 2;
                boolean flag = false;
                if(n==0||n==1){
                    System.out.println(2);
                    break;
                }
                while (a <= Math.sqrt(n)) {
                    if (n % a == 0) {
                        flag = true;
                        break;
                    }
                    a++;
                }

                if(!flag){
                    System.out.println(n);
                    break;
                }
                n++;
            }
        }
    }
}
