import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class Main {
/*

3595번
 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> soultion = soultion(n);
        long min  = Long.MAX_VALUE;
        int x =0;
        int y =0;
        int z =0;
        for (int i = 0; i < soultion.size(); i++) {
            for (int j = 0; j < soultion.size(); j++) {
                for (int k = 0; k < soultion.size(); k++) {
                    Integer a = soultion.get(i);
                    Integer b = soultion.get(j);
                    Integer c = soultion.get(k);
                    long sum = (long) a *b*c;
                    if(sum==n){
                        long l = (2*(long) a * b)+(2*(long) a * c)+(2*(long) c * b);
                        if(min>l){
                            min=l;
                            x=a;
                            y=b;
                            z=c;
                        }
                    }
                }
            }
        }
        System.out.println(x+" "+y+" "+z);
    }

    static ArrayList<Integer> soultion(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                list.add(n / i);
            }
        }
        Collections.sort(list);
        return list;
    }
}
