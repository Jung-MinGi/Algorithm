import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n+1][m+1];
        for(int i=1; i<n+1; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<m+1; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int sum=0;
            st =new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int i=a; i<=x; i++){
                for(int j=b; j<=y; j++){
                    sum +=arr[i][j];
                }
            }
            sb.append(sum).append('\n');
        }
        System.out.println(sb);
    }
}
