import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0) break;
            int ans = 0;
            int gap = Integer.MAX_VALUE;
            for (int i = 1; ; i++) {
                int pow = (int) Math.pow(i, b);

                int abs = Math.abs(pow - a);
                if(a>=pow&&gap>abs){
                    gap=abs;
                    ans=i;
                }else{
                    if(gap>abs){
                        ans=i;
                    }
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
