import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    /**
     * 4 10 11
     * 4 9 10 1번
     * 4 8 9 2번
     * 4 7 8 3번
     * 4 6 7 4번
     * 4 5 6
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
        int temp = Math.max(arr[1] - 1 - arr[0], arr[2] - 1 - arr[1]);
        System.out.println(temp);
    }
}
/**
 * 3 5 9
 * 5 8 9
 * 5 7 8
 */