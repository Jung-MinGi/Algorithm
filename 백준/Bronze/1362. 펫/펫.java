import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int tc = 1; ;tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());//적정체중
            int m = Integer.parseInt(st.nextToken());//실제체중
            if (n == 0 && m == 0) break;
            while (true) {
                st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                if (a.equals("F")&&m>0) m += num;
                else if (a.equals("E")&&m>0) m -= num;
                if(a.equals("#") && num == 0) {
                    if (m <= 0) {
                        System.out.println(tc + " "+"RIP");
                    }else{
                        System.out.print(tc + " ");
                        System.out.println((m > n / 2 && m < n * 2) ? ":-)" : ":-(");
                    }
                    break;
                }
            }

        }
    }
}
