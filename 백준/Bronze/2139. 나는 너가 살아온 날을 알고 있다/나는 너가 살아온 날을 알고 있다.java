import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
  static   int[] calender = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         /*
        n%4==0 && n%100==0 && n%400==0 윤년
        n%4==0 && n%100==0 && n%400!=0 평년
        n%4==0 && n%100!=0 && n%400!=0 윤년
         */
        while(true){
            int ans=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            if(day==0)break;
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());
            boolean flag=false;
            if(year%4==0&&year%100==0&&year%400==0)flag=true;
            else if(year%4==0&&year%100==0)flag=false;
            else if(year%4==0&&year%100!=0)flag=true;
            else flag=false;
                for(int i=1;i<month;i++){
                    if(i==2){
                        ans+=(flag)?29:28;
                        continue;
                    }
                    ans+=calender[i];
                }
                ans+=day;
                System.out.println(ans);

        }
    }
}
