import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());

            boolean[] door = new boolean[a + 1];
            Arrays.fill(door, true);
            for (int i = 2; i <= a; i++) {
                for (int j = 1; j <= a; j++) {
                    int x = i * j;
                    if (x <= a) {
                        if(door[x])door[x]=false;
                        else door[x]=true;
                    }
                }
            }
            int cnt=0;
            for (boolean b : door) {
                if(b)cnt++;
            }
            System.out.println(cnt-1);
        }
    }
}
