import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();
        int towerEatTime = Integer.parseInt(st.nextToken());
        int bulgogiEatTime = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int burger = 0;
        int cola = 10000;
        for (int i = 0; i <= t / towerEatTime; i++) {
            int remainT = t;
            remainT -= i * towerEatTime;
            if (remainT < 0) break;
            for (int j = 0; j <= remainT / bulgogiEatTime; j++) {
                int tmp = remainT;
                tmp -= j * bulgogiEatTime;
                if (tmp < 0) break;
//                if (tmp <= cola&&burger<i+j) {
                    cola = tmp;
                    burger = i + j;
                    list.add(new int[]{burger,cola});
//                }
            }
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[1]==b[1]){
                    return b[0]-a[0];
                }else return a[1]-b[1];
            }
        });
        System.out.println(list.get(0)[0] + " " + list.get(0)[1]);

    }

}


