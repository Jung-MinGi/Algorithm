import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double c = Double.parseDouble(st.nextToken());
        double d = Double.parseDouble(st.nextToken());
/**
 * 100 41
 * 13 99
 *
 * 13 100
 * 99 41
 */
        double[][] arr = new double[4][2];
        for (int i = 0; i < 4; i++) {
            double tmp = 0;
            switch (i) {
                case 0:
                    tmp = a / c + b / d;
                    arr[i] = new double[]{tmp, i};
                    break;
                case 1:
                    tmp = c / d + a / b;
                    arr[i] = new double[]{tmp, i};
                    break;
                case 2:
                    tmp = d / b + c / a;
                    arr[i] = new double[]{tmp, i};
                    break;
                case 3:
                    tmp = b / a + d / c;
                    arr[i] = new double[]{tmp, i};
                    break;
            }
        }
        Arrays.sort(arr, new Comparator<double[]>() {
            @Override
            public int compare(double[] a, double[] b) {

                if (a[0] == b[0]) {
                    return (int) (a[1] - b[1]);
                } else {
                    if (a[0] > b[0]) return -1;
                    else return 1;
                }
            }
        });
        System.out.println((int) arr[0][1]);
    }
}
