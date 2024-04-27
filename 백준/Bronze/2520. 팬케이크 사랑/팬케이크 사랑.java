import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main {

    private static int milk = 8;
    private static int egg = 8;
    private static int sugar = 4;
    private static int slat = 1;
    private static int carbo = 9;
    private static int[] fruit = {1,30,25,10};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(16*17/9);
        int n = Integer.parseInt(br.readLine());

        while(n-->0){
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x=Integer.MAX_VALUE;
            x = Math.min(x,Math.min((16* Integer.parseInt(st.nextToken())) / milk,
                    Math.min((16* Integer.parseInt(st.nextToken())) / egg,
                            Math.min((16* Integer.parseInt(st.nextToken())) / sugar,
                            Math.min((16* Integer.parseInt(st.nextToken())) / slat,
                                    (16* Integer.parseInt(st.nextToken())) / carbo)))));
            Integer[] a = new Integer[4];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 4; i++) {
                a[i]=Integer.parseInt(st.nextToken())/fruit[i];
            }
            Arrays.sort(a, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });
            int cnt=0;
            for (Integer i : a) {
                if(x>=i){
                    x-=i;
                    cnt+=i;
                }else{
                    cnt+=x;
                    break;
                }
            }
            System.out.println(cnt);
        }
    }
}
