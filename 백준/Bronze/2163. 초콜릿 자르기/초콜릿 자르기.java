import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    static Integer[][] dp = new Integer[301][301];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        dp[1][1] = 0;
        soultion(n,m);
        System.out.println(dp[n][m]);
    }

    static int soultion(int row, int col) {
        if (dp[row][col] == null) {
            if(row>=2){
                int i = row/2;
                dp[row][col] = soultion(i,col)+soultion(row-i,col)+1;
            }else{
                int i = col/2;
                dp[row][col] = soultion(row,i)+soultion(row,col-i)+1;
            }
        }
        return dp[row][col];
    }

}
