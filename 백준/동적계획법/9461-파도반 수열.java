import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    private static long[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            arr = new long[n+1];
            System.out.println(dp(n));
        }
    }//1112234
    static long dp(int a){
        arr[0]=1;
        arr[1]=1;
        arr[2]=1;
        arr[3]=1;
        if(arr[a] == 0){
                arr[a]=dp(a-2)+dp(a-3);
        }
        return arr[a];
    }
}


