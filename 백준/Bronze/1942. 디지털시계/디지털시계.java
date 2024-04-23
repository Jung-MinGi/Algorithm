import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    private static int endHour = 0;
    private static int endMin = 0;
    private static int endSec = 0;
    private static String end = "";
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            cnt = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringTokenizer a = new StringTokenizer(st.nextToken(), ":");
            int startHour = Integer.parseInt(a.nextToken());
            int startMin = Integer.parseInt(a.nextToken());
            int startSec = Integer.parseInt(a.nextToken());
            a = new StringTokenizer(st.nextToken(), ":");
            endHour = Integer.parseInt(a.nextToken());
            endMin = Integer.parseInt(a.nextToken());
            endSec = Integer.parseInt(a.nextToken());
            soultion(String.valueOf(startHour), String.valueOf(startMin), String.valueOf(startSec));
            while (true) {
                startSec++;
                if (startSec == 60) {
                    startSec = 0;
                    startMin++;
                    if (startMin == 60) {
                        startMin = 0;
                        startHour++;
                        if (startHour == 24) {
                            startHour = 0;
                        }
                    }
                }
                soultion(String.valueOf(startHour), String.valueOf(startMin), String.valueOf(startSec));
                if (startHour == endHour && startMin == endMin && startSec == endSec) {
                    System.out.println(cnt);
                    break;
                }
            }

        }
    }

    static void soultion(String h, String m, String s) {
        int a = Integer.parseInt(h + m + s);
        if (a % 3 == 0) cnt++;
    }

}
