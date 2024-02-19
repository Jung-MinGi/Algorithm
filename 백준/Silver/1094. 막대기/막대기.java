import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static int[] arr = new int[]{1, 2, 4, 8, 16, 32, 64};
    static boolean flag = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        soulution( 0, 0, 0, Integer.parseInt(br.readLine()));
    }

    static void soulution(int depth, int len, int cnt, int n) {
        if(len>64)return;
        if (len == n) {
            flag = true;
            System.out.println(cnt);
            return;
        }
        if (depth == 7) return;
        if (flag) return;
        soulution(depth + 1, len + arr[depth], cnt + 1, n);
        soulution(depth + 1, len, cnt, n);
    }
}