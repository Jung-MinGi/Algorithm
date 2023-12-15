import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if(n==1){
            System.out.println(1);
            return;
        }
        int cnt = 1;
        int index = 1;
        long tmp = n / 2;
        while (tmp != 1) {
            tmp = tmp / 2;
            index++;
        }
        if (n - pow(2, index) != 0) cnt++;

        System.out.println(index + cnt);
    }

    static long pow(long a, long b) {
        if (b == 0) {
            return 1;
        }

        long res = pow(a, b / 2);
        if (b % 2 == 0) {
            return res * res;
        } else return res * res * a;
    }

}
