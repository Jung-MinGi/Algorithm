import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        int time1=Integer.parseInt(st.nextToken())*3600+Integer.parseInt(st.nextToken())*60+Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(),":");
        int time2 = Integer.parseInt(st.nextToken())*3600+Integer.parseInt(st.nextToken())*60+Integer.parseInt(st.nextToken());

        int time=(time1>time2?(3600*24-time1)+time2:time2-time1);
        if(time1==time2){
            System.out.println("24:00:00");
            return;
        }

        int hour=time/3600;
        time=time%3600;
        int min=time/60;
        int sec=time%60;
        System.out.println((hour>=10?hour:"0"+hour)+":"+(min>=10?min:"0"+min)+":"+(sec>=10?sec:"0"+sec));
    }
}
