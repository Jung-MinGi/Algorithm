import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] hour1 = new char[5][3];
        char[][] hour2 = new char[5][3];
        char[][] min1 = new char[5][3];
        char[][] min2 = new char[5][3];
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int idx = 0;
            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                if (idx == 0) {
                    hour1[i][0] = s.charAt(0);
                    hour1[i][1] = s.charAt(1);
                    hour1[i][2] = s.charAt(2);
                } else if (idx == 1) {
                    hour2[i][0] = s.charAt(0);
                    hour2[i][1] = s.charAt(1);
                    hour2[i][2] = s.charAt(2);
                } else if (idx == 2) {
                    min1[i][0] = s.charAt(0);
                    min1[i][1] = s.charAt(1);
                    min1[i][2] = s.charAt(2);
                } else {
                    min2[i][0] = s.charAt(0);
                    min2[i][1] = s.charAt(1);
                    min2[i][2] = s.charAt(2);
                }
                idx++;
            }
        }
        int h1 = 0;
        int h2 = 0;
        int m1 = 0;
        int m2 = 0;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k < 6; k++) {
                    for (int l = 0; l <= 9; l++) {
                        if (check(hour1, i) && check(hour2, j) && check(min1, k) && check(min2, l)) {
                            h1 = i;
                            h2 = j;
                            m1 = k;
                            m2 = l;
                            StringBuilder sb = new StringBuilder();
                            sb.append(h1).append(h2).append(":").append(m1).append(m2);
                            System.out.println(sb);
                            return;
                        }
                    }
                }
            }
        }
    }

    static boolean check(char[][] arr, int num) {
        switch (num) {
            case 0:
                for (int i = 1; i <= 3; i++) {
                    if (arr[i][1] != '.') return false;
                }
                return true;
            case 1:
                for (int i = 0; i <= 4; i++) {
                    if (arr[i][0] == '#' || arr[i][1] == '#') return false;
                }
                return true;
            case 2:
                return arr[1][0] == '.' && arr[1][1] == '.'
                        && arr[3][1] == '.' && arr[3][2] == '.';
            case 3:
                return arr[1][0] == '.' && arr[1][1] == '.'
                        && arr[3][1] == '.' && arr[3][0] == '.';
            case 4:
                return arr[0][1] == '.' && arr[1][1] == '.'
                        && arr[3][0] == '.' && arr[3][1] == '.'
                        && arr[4][0] == '.' && arr[4][1] == '.';
            case 5:
                return arr[1][1] == '.' && arr[1][2] == '.'
                        && arr[3][1] == '.' && arr[3][0] == '.';
            case 6:
                return arr[1][1] == '.' && arr[1][2] == '.'
                        && arr[3][1] == '.';
            case 7:
                for (int i = 1; i <= 4; i++) {
                    if (arr[i][0] != '.' || arr[i][1] != '.') return false;
                }
                return true;
            case 8:
                return arr[1][1] == '.' && arr[3][1] == '.';
            default:
                return arr[1][1] == '.' && arr[3][1] == '.' && arr[3][0] == '.';
        }
    }
}


