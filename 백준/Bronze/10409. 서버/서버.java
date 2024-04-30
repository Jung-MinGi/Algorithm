import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int cnt = 0;
        st = new StringTokenizer(br.readLine());
        boolean flag=false;
        while (a-- > 0) {
            int n = Integer.parseInt(st.nextToken());
            if (t - n < 0||flag){
                flag=true;
                continue;
            }

            cnt++;
            t = t - n;
        }
        System.out.println(cnt);
    }

}

