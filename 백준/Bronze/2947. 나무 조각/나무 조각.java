import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int idx = 0;
        while (true) {
            boolean flag = false;
            for (int i = 0; i < 4; i++) {
                if (arr[i] > arr[i + 1]) {
                    idx++;
                    flag = true;
                    swap(arr, i, i + 1);
                    for (int a : arr) {
                        System.out.print(a + " ");
                    }
                    System.out.println();
                }
            }
            if (!flag) {
                break;
            }
        }
        if (idx == 0) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
