import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static boolean[] prime = new boolean[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 2; i < Math.sqrt(prime.length); i++) {
            if (!prime[i]) {
                for (int j = i * i; j < prime.length; j += i) prime[j] = true;
            }
        }
        prime[0] = prime[1] = true;
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            int x = Integer.parseInt(br.readLine());
            ArrayList<int[]> list = new ArrayList<>();
            for (int i = 2; i <= Math.sqrt(x); i++) {
                int cnt = 0;
                while (x % i == 0) {
                    x = x / i;
                    cnt++;
                }
                if(cnt!=0)list.add(new int[]{i, cnt});
            }
            if(!prime[x])list.add(new int[]{x,1});
            Collections.sort(list, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            for (int[] ints : list) {
                sb.append(ints[0]).append(' ').append(ints[1]).append('\n');
            }
        }
        System.out.println(sb);

    }
}


