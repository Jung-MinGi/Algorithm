import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[101];
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) arr[Integer.parseInt(st.nextToken())] = true;
        for (int i = 1; i <= n; i++) {
            if (i + 6 <= 100 && arr[i] && arr[i + 3] && arr[i + 6]) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }

}

