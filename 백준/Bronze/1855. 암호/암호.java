import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static char[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int row = s.length() / n;
        arr = new char[s.length() / n][n];
        int index = 0;
        for (int i = 0; i < row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = s.charAt(index);
                    index++;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    arr[i][j] = s.charAt(index);
                    index++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < row; j++) {
                sb.append(arr[j][i]);
            }
        }
        System.out.println(sb);
    }
}

