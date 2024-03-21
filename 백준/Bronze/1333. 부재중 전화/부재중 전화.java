import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int tmp=d;
        int time=0;
        while(true){
            if(n!=0){
                time+=l;
                n--;
            }
            if(time==d){
                System.out.println(d);
                break;
            }
            while(time>d)d+=tmp;
            time+=5;
            if(time>=d+1){
                System.out.println(d);
                break;
            }
        }
    }
}