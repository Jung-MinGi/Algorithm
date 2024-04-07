import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    static int[][] candidate = new int[4][5];
    static boolean flag = false;
    static int max = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        candidate[0][0]=-1;
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= 3; i++) extracted(i, Integer.parseInt(st.nextToken()));
        }
        Arrays.sort(candidate, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] == b[0]) {
                    if (a[3] == b[3]) {
                        if (a[2] == b[2]) {
                            flag = true;
                            max =Math.max(a[0],max);
                            return a[1] - b[1];
                        }
                        if(max==a[0])flag=false;
                        return b[2] - a[2];
                    }
                    if(max==a[0])flag=false;
                    return b[3] - a[3];
                }
                return b[0] - a[0];
            }
        });
        if (flag && max == candidate[0][0]) {
            System.out.println("0 " + max);
        } else {
            System.out.println(candidate[0][4] + " " + candidate[0][0]);
        }

    }

    private static void extracted(int idx, int a) {
        candidate[idx][4] = idx;
        candidate[idx][0] += a;
        if (a == 1) candidate[idx][1]++;
        else if (a == 2) candidate[idx][2]++;
        else candidate[idx][3]++;
    }


}
