import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static final int c = 0;
    public static final int h = 1;
    public static final int o = 2;

    /**
     * c h o
     * 0 1 2
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "+");
        String str1 = st.nextToken();
        st = new StringTokenizer(st.nextToken(), "=");
        String str2 = st.nextToken();
        String str3 = st.nextToken();
        String[] str = new String[3];
        str[0] = str1;
        str[1] = str2;
        str[2] = str3;
        int[][] arr = new int[3][3];
        int i = 0;
        for (String s : str) {
            soultion(s, arr, i);
            i++;
        }
        findConst(arr);
    }

    private static void soultion(String str1, int[][] arr, int idx) {
        for (int i = 0; i < str1.length(); i++) {
            char s = str1.charAt(i);
            if (s == 'C') arr[idx][0]++;
            else if (s == 'H') arr[idx][1]++;
            else if (s == 'O') arr[idx][2]++;
            else {
                char c = str1.charAt(i - 1);
                if (c == 'C') arr[idx][0] += (str1.charAt(i) - '0') - 1;
                else if (c == 'H') arr[idx][1] += (str1.charAt(i) - '0') - 1;
                else if (c == 'O') arr[idx][2] += (str1.charAt(i) - '0') - 1;
            }
        }
    }

    static void findConst(int[][] arr) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                for (int k = 1; k <= 10; k++) {
                    if (isEqual(arr, i, j, k)) return;
                }
            }
        }
    }

    static boolean isEqual(int[][] arr, int i, int j, int k) {
        int[] a = new int[]{arr[0][0], arr[0][1], arr[0][2]};
        int[] b = new int[]{arr[1][0], arr[1][1], arr[1][2]};
        int[] c = new int[]{arr[2][0], arr[2][1], arr[2][2]};
        for (int q = 0; q < a.length; q++) {
            a[q] *= i;
        }
        for (int q = 0; q < a.length; q++) {
            b[q] *= j;
        }
        for (int q = 0; q < a.length; q++) {
            c[q] *= k;
        }
        boolean flag = false;
        for (int r = 0; r < 3; r++) {
            if (a[r] + b[r] != c[r]) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println(i + " " + j + " " + k);
            return true;
        }
        return false;
    }
}


