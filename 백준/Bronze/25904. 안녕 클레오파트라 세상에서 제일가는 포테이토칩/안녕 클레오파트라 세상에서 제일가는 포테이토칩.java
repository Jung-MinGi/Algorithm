import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int  n =Integer.parseInt(st.nextToken());
        int  k =Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(st.nextToken());
        }

        for (int i = 0;; i++) {
            if(a[i%n]<k){
                System.out.println((i%n)+1);
                break;
            }else k++;
        }
    }
}
