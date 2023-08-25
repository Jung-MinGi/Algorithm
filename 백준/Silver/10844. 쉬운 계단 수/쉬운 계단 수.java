import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static Long[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new Long[n+1][10];
        for(int i=0; i<10; i++){
           dp[1][i]=1L;
        }
        long sum=0;
        for(int i=1; i<10; i++){
           sum+= recur(n,i);
        }
        System.out.println(sum  % 1000000000);
    }
    public static long recur(int a,int b){//a는 현재 몇번째 자릿수위치인지 b는 그 자릿수에 위치한 값
        if(a == 1){
            return dp[a][b];
        }
        if(dp[a][b] == null){
            if(b == 0){
                dp[a][b] = recur(a-1,1);
            }else if(b == 9){
                dp[a][b] = recur(a-1,1);
            }else {
                dp[a][b] = recur(a-1,b+1) + recur(a-1,b-1);
            }
        }
        return dp[a][b] % 1000000000;
    }
}
