import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input;
        int[] arr;

        while ((input = br.readLine()) != null && !input.isEmpty()) {
            arr = new int[4];
            for (int i = 0; i < input.length(); i++) {
                int a = input.charAt(i);
                if (a >= 97 && a <= 122) {
                    arr[0]++;
                } else if (a >= 65 && a <= 90) {
                    arr[1]++;
                } else if (a >= 48 && a <= 57) {
                    arr[2]++;
                } else {
                    arr[3]++;
                }
            }
            Arrays.stream(arr).iterator()
                    .forEachRemaining((int i)->sb.append(i).append(' '));
            sb.append('\n');
        }
        System.out.println(sb);

    }
}

