import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        System.out.println(binarySearch(n));

    }

    static long binarySearch(Long a) {
        long low = 0;
        long high = a;
        long ret=0;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (a <= Math.pow(mid, 2)) {
                ret=mid;
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
      return ret;
    }

}


