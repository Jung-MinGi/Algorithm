import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int[] arr = new int[301];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 1; i < 301; i++) {
            arr[i] = i * ((i+1) * (i + 2) / 2);
        }
        int a = Integer.parseInt(br.readLine());

        while(a-->0){
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            for(int i=1;i<=n;i++)sum+=arr[i];
            System.out.println(sum);
        }

    }
}
