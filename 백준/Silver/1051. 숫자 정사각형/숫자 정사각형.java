import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.MemoryType;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int[][] arr;
static int n;
static int answer=1;
static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];

        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++){
                arr[i][j] = s.charAt(j)-'0';
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                search(i,j);
            }
        }
        System.out.println(answer);
    }

    static void search(int a, int b) {
        for(int i=1;i<n;i++){
            if(a+i>=n||b+i>=m)return;
            if(arr[a][b]==arr[a+i][b] && arr[a][b]==arr[a][b+i] && arr[a][b]==arr[a+i][b+i]){
                int tmp = (i+1) * (1+i);
                answer = Math.max(tmp,answer);
            }
        }
    }
}
