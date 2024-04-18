import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final int x = 1140;
    private static final int y = 420;



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int price = 0;
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int a = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(s, ":");
            int hour = Integer.parseInt(st.nextToken());
            int min = Integer.parseInt(st.nextToken());
            while(a-->0){
                min++;
                if(min==60){
                    hour++;
                    min=0;
                    if(hour==24){
                        hour=0;
                    }
                }
                int time = getTime(hour, min);
                if(time>x||time<=y){
                    price+=5;
                }else{
                    price+=10;
                }
            }
        }
        System.out.println(price);

    }
    static int getTime(int h,int m){
        return h*60+m;
    }
}
