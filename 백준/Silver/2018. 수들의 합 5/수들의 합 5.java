import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int cnt=0;
        int prev=1;
        if(n!=1){
            for (int i = 1; i <= ((n % 2==1)?n/2+1:n/2); i++) {
                sum += i;
                if (sum < n) continue;
                if (sum == n) {
                    cnt++;
                } else {
                    while (sum > n) {
                        sum -= prev;
                        prev++;
                    }
                    if(sum==n)cnt++;
                }
            }
        }

        System.out.println(++cnt);
    }
}
