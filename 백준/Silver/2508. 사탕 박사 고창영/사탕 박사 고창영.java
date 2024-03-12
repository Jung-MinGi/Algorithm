import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] arr;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        br.readLine();
        while (testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            cnt=0;
            arr = new char[n][m];
            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                findCandy(s);
                for (int j = 0; j < s.length(); j++) {
                    arr[i][j] = s.charAt(j);
                }
            }
            for (int i = 0; i < m; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (arr[j][i] == 'v') sb.append('>');
                    else if (arr[j][i] == '^') sb.append('<');
                    else if(arr[j][i]=='o')sb.append('o');
                    else sb.append('.');
                }
                findCandy(sb.toString());
            }
            System.out.println(cnt);
            br.readLine();
        }
    }

    static void findCandy(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '>') {
                if (s.length() > i + 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(s.charAt(i)).append(s.charAt(i + 1)).append(s.charAt(i + 2));
                    if (sb.toString().equals(">o<")) cnt++;
                }
            }
        }

    }
}


