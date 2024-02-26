import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int n, m;
    static long result = 0;
    static long[] arr;
    static long[] brr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        arr = new long[a.length()];
        brr = new long[b.length()];
        for (int i = 0; i < a.length(); i++) {
            arr[i] = a.charAt(i) - '0';
        }
        for (int i = 0; i < b.length(); i++) {
            brr[i] = b.charAt(i) - '0';
        }
        for (long l : arr) {
            for (int j = 0; j < brr.length; j++) {
                result += (l * brr[j]);
            }
        }
        System.out.println(result);
    }
}