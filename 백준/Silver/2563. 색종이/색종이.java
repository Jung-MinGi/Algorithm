import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {

    public static int[][] arr = new int[100][100];
    static int answer=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = 100 - Integer.parseInt(st.nextToken());
            draw(b, a);
        }
//        partition(0,0,100);
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(arr[i][j]==1)answer++;
            }
        }
        System.out.println(answer);

    }
    static void draw(int row, int col) {
        for (int i = row; i > row - 10; i--) {
            for (int j = col; j < col + 10; j++) {
                arr[i][j] = 1;
            }
        }
    }
}