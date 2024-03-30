import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int[] left;
    static int[] right;
    static int[] arr;

    /**
     * 1668
     *
     * @param args
     * @throws Exception
     */

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        left = new int[n];
        right = new int[n];
        left[0] = 1;
        int leftCount = 1;
        int rightCount = 1;
        int leftMax = arr[0];
        int rightMax = arr[n - 1];
        for (int i = 1; i < n; i++) {
            if (leftMax < arr[i]) {
                leftCount++;
                leftMax = arr[i];
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (rightMax < arr[i]) {
                rightCount++;
                rightMax = arr[i];
            }
        }
        System.out.println(leftCount);
        System.out.println(rightCount);
    }
}

