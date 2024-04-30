import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=Integer.parseInt(st.nextToken());
        }
        System.out.print(a[0]+" ");
        int sum=a[0];
        for(int i=1;i<n;i++){
            int v = a[i] * (i+1) - sum;
            System.out.print(v+" ");
            sum+=v;
        }
    }

}

