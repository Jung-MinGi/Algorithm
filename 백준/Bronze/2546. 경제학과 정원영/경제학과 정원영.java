import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] c;
    static int[] math;
    static double orginalCAverage = 0;
    static double orginalCSum = 0;
    static double orginalMathSum = 0;
    static double orginalMathAverage = 0;
    static int cnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            cnt=0;
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            c = new int[a];
            math = new int[b];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < a; i++) c[i] = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < b; i++) math[i] = Integer.parseInt(st.nextToken());
            long tmp = 0;
            for (int i : c) {
                tmp += i;
            }
            orginalCSum=tmp;
            orginalCAverage = (double)tmp / c.length;
            tmp = 0;
            for (int i : math) {
                tmp += i;
            }
            orginalMathSum=tmp;
            orginalMathAverage = (double)tmp / math.length;

            for (int i = 0; i < c.length; i++) {
                getAverage(i);
            }
            System.out.println(cnt);
        }
    }

    static void getAverage(int idx) {
        double a = orginalCSum;
        a = a - c[idx];
        if (orginalCAverage >= a / (c.length - 1)) return;

        a = orginalMathSum;

        a += c[idx];
        if (orginalMathAverage>= a / (math.length + 1)) return;
        cnt++;

    }
}
