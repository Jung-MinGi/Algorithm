import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    static int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = 2014;
        int month = 4;
        int day = 2;
        int n = Integer.parseInt(br.readLine()) - 1;
        while (n-- > 0) {
            day++;
            if (a[month] < day) {
                day = 1;
                month++;
                if (month == 13) {
                    month = 1;
                    year++;
                    if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) a[2] = 29;
                    else if (year % 4 == 0 && year % 100 == 0) a[2] = 28;
                    else if (year % 4 == 0 && year % 100 != 0) a[2] = 29;
                    else a[2] = 28;
                }
            }
        }
        System.out.println(year + "-" + ((month>=10)?month:"0"+month) + "-" + ((day>=10)?day:"0"+day));
    }

}

