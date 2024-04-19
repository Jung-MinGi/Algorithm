import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    /**
     * 24-주어진 시간
     * and + 그다음 주어진시간
     *
     * @param args
     * @throws IOException
     */
    private static final int n = 24 * 3600;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int time1 = Integer.parseInt(st.nextToken()) * 3600 + Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), ":");
        int time2 = Integer.parseInt(st.nextToken()) * 3600 + Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
        int ans = 0;
        if (time1 > time2) {
            ans = n - time1 + time2;
        } else if(time1<time2){
            ans = time2 - time1;
        }else{
            System.out.println("24:00:00");
            return;
        }
        int hour = 0;
        int min = 0;
        int sec = 0;
        while (true) {
            if (ans >= 3600) {
                hour = (ans / 3600);
                ans = ans % 3600;
            } else if (ans >= 60) {
                min = (ans / 60);
                ans = ans % 60;
            } else {
                sec = (ans);
                break;
            }
        }
        System.out.print((hour<10?"0"+hour:hour)+":");
        System.out.print((min<10?"0"+min:min)+":");
        System.out.print((sec<10?"0"+sec:sec));
    }
}
