import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[] x;
    static int[] y;
    static String[] z;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        x = new int[n];
        y = new int[n];
        z = new String[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            y[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            z[i] = st.nextToken();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j <n ; j++) {
                if(!z[i].equals(z[j])){
                    if(Math.abs(x[i]-x[j])<=y[i]+y[j]){
                        System.out.println("YES");
                        System.out.println((i+1)+" "+(j+1));
                        return;
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
