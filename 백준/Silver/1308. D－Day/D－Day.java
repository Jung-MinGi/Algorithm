import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int[] month = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startYear = Integer.parseInt(st.nextToken());
        int startM = Integer.parseInt(st.nextToken());
        int startD = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int year = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int dDay = 0;
        if(year-startYear>1000){
            System.out.println("gg");
        }else{
            if(year-startYear==1000&&(startM<m||startM==m&&startD<=d)){
                System.out.println("gg");
            }else{
                checkYear(startYear);
                while (true) {

                    startD++;
                    dDay++;

                    if (month[startM] < startD) {
                        startD = 1;
                        startM++;
                        if (startM > 12) {
                            startYear++;
                            startM = 1;
                            checkYear(startYear);
                        }
                    }
                    if (startYear == year && startM == m && startD == d) {
                        System.out.println("D-" + dDay);
                        break;
                    }
                }
            }
        }

    }

    static void checkYear(int year) {
      if((year%4==0&&year%100!=0)||year%400==0){
          month[2]=29;
      }else month[2]=28;


    }

}