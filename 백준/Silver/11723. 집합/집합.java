import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int set=0;
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch (str){
                case "add":
                    set|=(1<< Integer.parseInt(st.nextToken())-1);
                    break;
                case "remove":
                    set &=~(1<< Integer.parseInt(st.nextToken())-1);
                    break;
                case "check":
                    int a=0;
                    a = set & (1<< Integer.parseInt(st.nextToken())-1);
                    sb.append(((a==0)?0:1)).append('\n');
                    break;
                case "toggle":
                    int num=Integer.parseInt(st.nextToken());
                   set ^=(1<<num-1);
                    break;
                case "all":
                    set = (1<<21)-1;
                    break;
                case "empty":
                    set = 0;
                    break;

            }
        }
        System.out.println(sb);
    }
}