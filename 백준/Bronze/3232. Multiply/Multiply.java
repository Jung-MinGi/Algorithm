import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[] arr = new char[36];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();
            String c = st.nextToken();
            boolean flag=false;
            for (int i = 2; i <= 16; i++) {
                if(isPossible(a,i)&&isPossible(b,i)&&isPossible(c,i)){
                    if ((soultion2(i, a) * soultion2(i, b)) == soultion2(i, c)) {
                        flag=true;
                        System.out.println(i);
                        break;
                    }
                }

            }
            if(!flag) System.out.println(0);
        }
    }

    static boolean isPossible(String x, int target) {
        for (int i = 0; i < x.length(); i++) {
            if ((x.charAt(i) - '0') >= target) return false;
        }
        return true;
    }

    static Long soultion2(int idx, String x) {
        StringBuilder sb = new StringBuilder(x).reverse();
        long ret = 0;
        for (int i = 0; i < sb.length(); i++) {
            long pow = (long) Math.pow(idx, i);
            int a = sb.charAt(i) - '0';
            if (a >= 10) {
                ret += (pow * arr[a]);
            } else {
                ret += (pow * a);
            }
        }
        return ret;
    }
}
