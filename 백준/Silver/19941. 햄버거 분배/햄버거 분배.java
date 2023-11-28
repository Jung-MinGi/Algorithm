import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[] charArray = br.readLine().toCharArray();
        boolean[] visit = new boolean[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (charArray[i] == 'H') {
                boolean flag = false;
                for (int l = -k; l <= -1; l++) {
                    if (i + l >= 0 && charArray[i + l] == 'P' && !visit[i + l]) {
                        visit[i + l] = true;
                        cnt++;
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    for (int l = 1; l <= k; l++) {
                        if (i + l < n && charArray[i + l] == 'P' && !visit[i + l]) {
                            visit[i + l] = true;
                            cnt++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}


