import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        if(x>y){
            System.out.println(playGame(y,x,1));
        }else{
            System.out.println(playGame(x,y,1));
        }
    }

    static int playGame(long a, long b, int cnt) {
        if (a - b == -1 && a % 2 == 1 && (b % 2) == 0) return cnt;

       return playGame(Math.round((double) a/2),Math.round((double) b/2),cnt+1);
    }

}
