import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            if (N == 0) break;
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i]=Integer.parseInt(st.nextToken());
            }
            System.out.print(a[0]+" ");
            for (int i = 1; i < N; i++) {
                if(a[i-1]==a[i])continue;
                System.out.print(a[i]+" ");
            }
            System.out.println("$");
        }
    }
}
