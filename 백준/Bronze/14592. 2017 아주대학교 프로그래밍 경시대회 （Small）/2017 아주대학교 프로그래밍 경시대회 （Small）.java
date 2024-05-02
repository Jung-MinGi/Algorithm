import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] a = new int[n][4];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a[i] = new int[]{Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),i};
        }
        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0]==b[0]){
                    if(a[1]==b[1]){
                        return a[2]-b[2];
                    }return a[1]-b[1];
                }return b[0]-a[0];

            }
        });
        System.out.println(a[0][3]+1);
    }
}