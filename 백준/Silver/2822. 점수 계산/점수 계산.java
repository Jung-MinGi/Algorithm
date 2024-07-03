import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {

static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] a = new int[8][2];
        for (int i = 0; i < 8; i++) {
            a[i] = new int[]{Integer.parseInt(br.readLine()),i+1};
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return b[0]-a[0];
            }
        });
        int sum=0;
        int[] order = new int[5];
        for (int i = 0; i < 5; i++) {
            sum+=a[i][0];
            order[i]=a[i][1];
        }
        System.out.println(sum);
        Arrays.sort(order);
        for (int i : order) {
            System.out.print(i+" ");
        }
    }


}