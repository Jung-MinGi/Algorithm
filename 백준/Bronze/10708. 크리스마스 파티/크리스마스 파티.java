import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    /*

     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int[] a = new int[x+1];
        int tc=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] game = new int[tc];
        for (int i = 0; i < tc; i++) {
            game[i]=Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < tc; i++) {
            int n = game[i];
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= x; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if(tmp==n)a[j]++;
                else a[n]++;
            }

        }
        for (int i = 1; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}