import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int[] dp;
    static int[] arr;
static int max=1;
    /**
     * 5
     * 5 6 1 2 3
     * 12
     * 349 459 138 262 99 693 106 762 122 553 96 514
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        arr = new int[n + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < arr.length; i++) {
            dp(i);
        }
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=n; i>=1; i--){
            if(dp[i]==max){
                if(deque.size()==0){
                    deque.addLast(arr[i]);
                    max--;
                    continue;
                }
                if(deque.peekLast()>arr[i]){
                    deque.addLast(arr[i]);
                    max--;
                }

            }
        }
        System.out.println(deque.size());
        StringBuilder sb = new StringBuilder();
        while(!deque.isEmpty()){
            sb.append(deque.pollLast()).append(' ');
        }
        System.out.println(sb);

    }

    static int dp(int n) {
        if (dp[n] == 0) {
            for (int i = 1; i < n; i++) {
                if (arr[n] > arr[i]) {
                    dp[n] = Math.max(dp(i), dp[n]);
                }
            }
            dp[n]++;
            max=Math.max(dp[n],max);
        }
        return dp[n];
    }
}

