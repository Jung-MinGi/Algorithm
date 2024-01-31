import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n;
    static int k;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        for (int i = 1; i < 100000; i++) {
            for (int j = 1; j < 100000; j++) {
                int[] arr = new int[n];
                arr[0] = i;
                arr[1] = j;
                int soultion = soultion(n - 1, arr);
                if (soultion == k) {
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
            }
        }

    }

    static int soultion(int idx, int[] arr) {
        if (arr[idx] != 0) return arr[idx];
        return arr[idx] = soultion(idx - 1, arr) + soultion(idx - 2, arr);
    }
}