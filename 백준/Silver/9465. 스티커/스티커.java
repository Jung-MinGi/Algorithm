import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Integer[][] dp;
    static int[][] arr;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            dp = new Integer[3][a + 1];

            arr = new int[3][a + 1];
            for (int i = 1; i <= 2; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= a; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            dp[0][1] = 0;
            dp[1][1] = arr[1][1];
            dp[2][1] = arr[2][1];
            dp(0,a);
            dp(1, a);
            dp(2, a);
            sb.append(Math.max(Math.max(dp[0][a],dp[1][a]),dp[2][a])).append('\n');
        }
        System.out.println(sb);


    }


    static int dp(int x, int y) {
        if (dp[x][y] == null) {
            if(x==0){
                dp[x][y]=Math.max(dp(x+1,y-1),dp(x+2,y-1));
            }else if(x==1){
                dp[x][y]=Math.max(dp(x-1,y-1),dp(x+1,y-1))+arr[x][y];
            }else{
                dp[x][y]=Math.max(dp(x-1,y-1),dp(x-2,y-1))+arr[x][y];
            }
        }
        return dp[x][y];
    }
}

