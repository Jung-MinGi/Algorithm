import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    static int[] calender = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean flag = false;
        if (n % 4 == 0 && n % 100 != 0 || n % 400 == 0) calender[2]++;

        int x = Integer.parseInt(br.readLine());
        int month = 1;
        int answer = 0;
        while (true) {
            int[] a = new int[8];//4 6 9 11
            for (int i = 1; i <= calender[month]; i++) {
                a[x]++;
                if (x == 7) x = 1;
                else x++;
            }

            for (int i : a) {
                answer += i / 5;
            }
            month++;
            if (month == 13) break;

        }

        System.out.println(answer);
    }
}
