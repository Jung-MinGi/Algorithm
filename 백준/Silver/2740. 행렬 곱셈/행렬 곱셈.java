import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Integer[][] first = new Integer[n+1][m+1];
        for(int i=1;i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=m;j++){
                first[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Integer[][] second = new Integer[m+1][k+1];
        for(int i=1;i<=m;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1;j<=k;j++){
                second[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        int[][] answer = new int[n+1][k+1];
        for (int i = 1; i <= n; i++) {//첫번째 행렬 행
            for (int j = 1; j <= k; j++) {//첫번째 행렬 열,두번째 행렬의 행
                for(int a=1;a<=m;a++){//세번째 행렬의 열
                    answer[i][j]+=first[i][a]*second[a][j];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
               sb.append(answer[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
