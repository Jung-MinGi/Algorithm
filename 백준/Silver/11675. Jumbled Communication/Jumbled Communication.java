import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int tc = 1; tc <= T; ++tc) {
            int n = Integer.parseInt(st.nextToken());
            for(int i=0;i<=255;i++){
                int ret = i ^ (i << 1);
                if((ret&255)==n){
                    System.out.print(i+" ");
                    break;
                }
            }
        }
    }
}
