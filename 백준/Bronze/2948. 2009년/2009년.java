import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int[] calender = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31};
    static String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 3;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int day = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int cnt=1;
//        int i = calender[month];
        for(int i=1;i<month;i++){
            int a = calender[i];
            for(int j=1;j<=a;j++){
                idx++;
                if(idx==week.length)idx=0;
            }
        }
        while(--day>0){
            idx++;
            if(idx==week.length)idx=0;
        }
        System.out.println(week[idx]);
    }
}
