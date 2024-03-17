import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static long min = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        boolean flag = (a + b) % 2 == 0;
        int tmpA=a;
        int tmpB=b;
        int k=0;
        min = (long) (a + b) * x;
        long prev = min;
        while(a!=0&&b!=0){
            a--;
            b--;
            k++;
            long l = prev - (x * 2L) + y;
            min = Math.min(min, l);
            prev = l;
        }
        if(flag){
            min = Math.min(min,(long) Math.max(tmpA, tmpB) * y);
        }else min = Math.min(min,(((long) Math.max(tmpA, tmpB)-1) * y)+x);

        System.out.println(min);
//
//        for (int i = 1; i <= a; i++) {
//            long l = prev - (x * 2L) + y;
//            System.out.println("l = " + l);
//            min = Math.min(min, l);
//            prev = l;
//        }
//        if ((a + b) % 2 == 0) min = Math.min(min, (long) Math.max(a, b) * y);
//        System.out.println(min);
    }
}
