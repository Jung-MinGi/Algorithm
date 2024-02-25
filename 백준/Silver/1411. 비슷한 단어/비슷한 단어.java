import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n, m, k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (change(arr[i], arr[j])) cnt++;
            }
        }
        System.out.println(cnt);
    }

    static boolean change(String a, String b) {
        int[] alphabet = new int[26];
        boolean[] use = new boolean[a.length()];
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (!use[i]) {

                alphabet[b.charAt(i) - 'a']++;
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < i; k++) sb.append(a.charAt(k));
                for (int j = i; j < a.length(); j++) {
                    if (a.charAt(j) == c&&!use[j]) {
                        sb.append(b.charAt(i));
                        use[j] = true;
                    } else sb.append(a.charAt(j));
                }
                a = sb.toString();
            }
        }
        boolean flag = true;
        for (int i : alphabet) {
            if (i > 1) {
                flag = false;
                break;
            }
        }
        return flag && a.equals(b);
    }
}