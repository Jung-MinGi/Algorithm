import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
static boolean[] prime = new boolean[1000001];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        setUp();
        BigInteger k = new BigInteger(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        for(int i=2;i<l;i++){
            if(prime[i])continue;
            if(k.remainder(new BigInteger(i+"")).compareTo(new BigInteger("0"))==0){
                System.out.println("BAD "+i);
                return;
            }
        }
        System.out.println("GOOD");
    }
    static void setUp(){
        for(int i=2;i<Math.sqrt(prime.length);i++){
            if(prime[i])continue;
            for(int j=i*i;j< prime.length;j+=i)prime[j]=true;
        }
    }
}