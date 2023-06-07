import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] dp0 = new int[41];
    static int[] dp1 = new int[41];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
       dp0[0]=1;
       dp0[1]=0;
       dp1[0]=0;
       dp1[1]=1;
        for(int i=2; i<dp0.length; i++){
            dp0[i]=-1;
            dp1[i]=-1;
        }
        while(n-->0){
            int a = Integer.parseInt(br.readLine());
            System.out.println(recur0(a)+" "+recur1(a));
        }
    }
    static int recur0(int a){
      if(dp0[a]==-1){
          dp0[a]=recur0(a-1)+recur0(a-2);
      }
    return dp0[a];
    }
    static int recur1(int a){
        if(dp1[a]==-1){
            dp1[a]=recur1(a-1)+recur1(a-2);
        }
        return dp1[a];
    }
}