import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static long ret,x,y=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
         x = Integer.parseInt(st.nextToken());
         y = Integer.parseInt(st.nextToken());
        soultion(0);
        System.out.println(ret);
    }
    static void soultion(long a){
        if(a>y)return;
        if(a>=x)ret++;

        soultion(a*10+4);
        soultion(a*10+7);
    }
}


