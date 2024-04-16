import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        arr[0] = 1;
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'A':
                    swap(arr, 0, 1);
                    break;
                case 'B':
                    swap(arr, 1, 2);
                    break;
                case 'C':
                    swap(arr, 0, 2);
                    break;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (arr[i] == 1) {
                System.out.println(i + 1);
                break;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
