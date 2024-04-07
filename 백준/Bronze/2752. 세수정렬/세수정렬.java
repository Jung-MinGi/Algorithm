import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer sts = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {

            arr[i] = Integer.parseInt(sts.nextToken());
        }
        Arrays.sort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
