import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Integer[][] arr = new Integer[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int answer = 0;
        //서
        for(int i=0;i<n;i++){
            Integer[] integers = arr[i];
            for(int j=0;j<m;j++){
                if(j==0){
                    answer+=integers[j];
                    continue;
                }
                int a = integers[j] - integers[j - 1];
                if(a<=0) continue;
                answer+=a;
            }
        }
        //남
        for(int i=0;i<m;i++){
            for(int j=n-1;j>=0;j--){
                if(j==n-1){
                    answer+=arr[j][i];
                    continue;
                }
                int a = arr[j][i]-arr[j+1][i];
                if(a<=0) continue;
                answer+=a;
            }
        }
        //동
        for(int i=0;i<n;i++){
            Integer[] integers = arr[i];
            for(int j=m-1;j>=0;j--){
                if(j==m-1){
                    answer+=integers[j];
                    continue;
                }
                int a = integers[j]-integers[j+1];
                if(a<=0) continue;
                answer+=a;
            }
        }

        //북
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    answer += arr[j][i];
                    continue;
                }
                int a = arr[j][i] - arr[j - 1][i];
                if (a <= 0) continue;
                answer += a;
            }
        }
        System.out.println(answer+(n*m*2));
    }
}
