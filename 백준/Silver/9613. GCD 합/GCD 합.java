import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr;
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            arr = new int[Integer.parseInt(st.nextToken())];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            long sum = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    sum += gcd(arr[i], arr[j]);
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }

    static int gcd(int a, int b) {
        if (a % b != 0) {
            return gcd(b, a % b);
        }
        return b;
    }


}
