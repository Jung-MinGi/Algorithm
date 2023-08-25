import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    static final int val = 1000000000;
    static int[][] dp = new int[101][10];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < 101; i++) {
            Arrays.fill(dp[i],-1);
        }
        Arrays.fill(dp[1], 1);
        for(int i=2; i<101; i++){
            for(int j=0; j<10; j++){
                if(j==0){
                    dp[i][j]=dp[i-1][j+1]%val;
                }else if(j==9){
                    dp[i][j]=dp[i-1][j-1]%val;
                }else{
                    dp[i][j]=((dp[i-1][j+1]%val)+(dp[i-1][j-1]%val)%val);
                }
            }
        }

        long sum=0;
        for(int i=1; i<10; i++){
            sum+=dp[n][i];
        }
        int a=4;
        System.out.println(sum%val);

    }

//    static int dp(int x, int y) {
//        if (dp[x][y] == -1) {
//            if (y == 9) {
//                dp[x][y] = dp(x - 1, y - 1)%val;
//            } else if(y==0){
//                dp[x][y]= (dp(x - 1, y + 1)%val);
//            }else {
//                dp[x][y] = ((dp(x - 1, y - 1)%val)  + (dp(x - 1, y + 1)%val)%val);
//            }
//        }
//    return dp[x][y];
    
}
