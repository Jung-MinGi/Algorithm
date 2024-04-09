import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 3;
        while (n-- > 0) {
            String s = br.readLine();
            Integer[] arr = new Integer[s.length()];
            Arrays.fill(arr, 1);
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) arr[i] += arr[i - 1];
                else arr[i] = 1;
            }
            Arrays.sort(arr, (Integer a, Integer b) -> b - a);
            System.out.println(arr[0]);
        }
    }
}
