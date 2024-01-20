import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int max = -1;
        for (int i = 1; i <= k; i++) {
            int tmp = normalize(String.valueOf(n * i).toCharArray());
            max = Math.max(max,tmp);
        }
        System.out.println(max);
    }

    private static int normalize(char[] num) {
        StringBuilder sb = new StringBuilder();
        for (int i = num.length - 1; i >= 0; i--) {
            sb.append(num[i]-'0');
        }
        return Integer.parseInt(sb.toString());
    }
}

