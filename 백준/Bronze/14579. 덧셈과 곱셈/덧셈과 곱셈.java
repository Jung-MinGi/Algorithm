import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final int  MOD=14579;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int ret=1;
        for(int i=a;i<=b;i++){
            int x = (i * (i + 1)) / 2;
            ret=(ret*x)%MOD;
            }
        System.out.println(ret);
    }
}