import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static int[] arr = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < 1001; i++) {
            arr[i] = arr[i - 1] + i;
        }

        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {

            int a = Integer.parseInt(br.readLine());
            boolean flag = false;
            for (int i = 1; i <= a; i++) {
                flag=false;
                for (int j = 1; j <= a; j++) {
                    for (int k = 1; k <= a; k++) {
                        if (arr[i] + arr[j] + arr[k] == a) {
                            System.out.println(1);
                            flag = true;
                            break;
                        }
                    }
                    if (flag) break;
                }
                if (flag) break;
            }
            if(!flag) System.out.println(0);

        }
    }
}
