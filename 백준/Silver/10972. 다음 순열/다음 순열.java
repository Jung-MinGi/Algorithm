import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int[] arr;
    static int[] dp;
    static boolean[] visit;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static LinkedHashSet<String> set = new LinkedHashSet<>();
    static int N;
    static int M;
    static boolean flag = false;
    static String answer = "";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[N + 1];
        visit = new boolean[N + 1];
        dp = new int[N];
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        soultion(arr);


    }

    static void soultion(int[] a) {
        for (int i = a.length - 1; i > 1; i--) {
            if (a[i] > a[i - 1]) {
                for (int j = a.length - 1; j >= i; j--) {
                    if (a[i - 1] < a[j]) {
                        int temp = a[i - 1];
                        a[i - 1] = a[j];
                        a[j] = temp;
                        break;
                    }
                }
                Arrays.sort(a, i, a.length);
                for (int k : a) {
                    if (k == 0) continue;
                    System.out.print(k + " ");
                }
                return;
            }
        }
        System.out.println(-1);
    }
}


