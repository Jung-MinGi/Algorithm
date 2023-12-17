import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        boolean[] prime = new boolean[n+1];
        prime[0]=true;
        prime[1]=true;
        int cnt=0;
        for(int i=2;i<=n;i++){
            for(int j=i;j<=n;j+=i){
                if(prime[j]) continue;
                prime[j]=true;
                cnt++;
                if(cnt==m){
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}
