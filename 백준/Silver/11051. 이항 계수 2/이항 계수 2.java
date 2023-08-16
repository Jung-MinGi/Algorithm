import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[][] memozation;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        memozation = new int[x + 1][x + 1];
        memozation[1][0]=1;
        memozation[1][1]=1;
        int combination = combination(x, y);
        System.out.println(combination);
    }

    static int combination(int a, int b) {
        if (memozation[a][b] == 0) {
            if (a == b || b == 0) {
                memozation[a][b]=1;
                return memozation[a][b];
            }
            memozation[a][b] = ((combination(a - 1, b - 1)%10007) + (combination(a - 1, b)%10007))%10007;
        }
        return memozation[a][b];
    }
}
