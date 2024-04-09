import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] radius = new int[][]{{9, 100}, {36, 80}, {81, 60}, {144, 40}, {225, 20}};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = 0;
            int b = 0;
            for (int j = 0; j < 3; j++) {
                a += getScore(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
            }
            for (int j = 0; j < 3; j++) {
                b += getScore(Double.parseDouble(st.nextToken()), Double.parseDouble(st.nextToken()));
            }
            sb.append("SCORE: ").append(a).append(" to ").append(b).append(", ");
            if(a==b){
                sb.append("TIE.");
            }else sb.append("PLAYER ").append((a>b)?1:2).append(" WINS.");
            sb.append('\n');
        }
        System.out.println(sb);
    }

    static int getScore(double x, double y) {
        double v = Math.pow(0 - x, 2) + Math.pow(0 - y, 2);
        for (int[] ints : radius) {
            if (ints[0] >= v) {
                return ints[1];

            }
        }

        return 0;
    }
}
