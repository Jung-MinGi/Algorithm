import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    static boolean[] arr = new boolean[1000];
    static int[][] array;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        array = new int[n][3];
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[n][0] = Integer.parseInt(st.nextToken());
            array[n][1] = Integer.parseInt(st.nextToken());
            array[n][2] = Integer.parseInt(st.nextToken());
            if(array[n][1]==3){
                System.out.println(1);
                return;
            }
        }

        for (int i = 100; i < 1000; i++) {
            boolean flag = false;
            String x = String.valueOf(i);
            if(x.contains("0"))continue;
            if(x.charAt(0)==x.charAt(1) && x.charAt(0)==x.charAt(2))continue;
            if(x.charAt(0)==x.charAt(1) || x.charAt(0)==x.charAt(2)||x.charAt(1)==x.charAt(2))continue;
            for (int[] ints : array) {
                int strike = 0;
                int ball = 0;
                String s = String.valueOf(ints[0]);
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (x.charAt(j) == s.charAt(k)) {
                            if (j == k) strike++;
                            else ball++;
                        }
                    }
                }
                if (strike != ints[1] || ball != ints[2]) {
                    flag = true;
                    break;
                }

            }
            if (!flag) cnt++;
        }
        System.out.println(cnt);
    }


}
