import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    static int album = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        album = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        for (int i = 1; ; i++) {
            int checked = isChecked(i);
            if (checked == target) {
                System.out.println(i);
                return;
            }
        }
    }

    static int isChecked(int idx) {
        double v = idx / (double) album;
        if ((v * 10) % 10 == 0) return (int) v;
        int ret = (int) (((v * 10) - (v * 10) % 10) + 10);
        return ret / 10;
    }
}
