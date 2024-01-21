import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.MemoryType;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int count = Integer.MAX_VALUE;
    static int[] memo;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        memo = new int[n + 1];
        Arrays.fill(memo,Integer.MAX_VALUE);
        memo[0]=0;
        memo[1] = 1;

        for(int i=2;i<=n;i++){
            for(int j=1;j*j<=i;j++){
                memo[i] = Math.min(memo[i],memo[i-j*j]);
            }
            memo[i]++;
        }
        System.out.println(memo[n]);

    }
}
