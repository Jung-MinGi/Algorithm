import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());//꼬치개수
        int b = Integer.parseInt(st.nextToken());//딸기 개수
        int c = Integer.parseInt(st.nextToken());//샤인
        int[] star = new int[a];
        int[] grape = new int[a];
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            star[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            grape[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < a; i++) {
            if (star[i] == grape[i]) sb.append(0);
            else {
                int cnt = 0;
                int x = star[i];
                int y = grape[i];
                while (cnt++ < 10000) {
                    x += b;
                    y += c;
                    if (x == y) {
                        sb.append(cnt);
                        break;
                    }
                }
                if (x != y) {
                    System.out.println("NO");
                    return;
                }
            }
            sb.append(' ');
        }
        System.out.println("YES");
        System.out.println(sb);

    }
}