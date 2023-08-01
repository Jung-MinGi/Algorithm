import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {


    static int[] arr;
    static int n, m;
    static Map<String, Integer> hm = new LinkedHashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int 최소공배수=0;
            if(a>b){
                최소공배수=gcd(a,b);
            }else 최소공배수=gcd(b,a);
            sb.append((a*b)/최소공배수).append(" ").append(최소공배수).append('\n');
        }
        System.out.println(sb);
    }
    static int gcd(int x,int y){
        if(y==0) return x;
        else return gcd(y,x%y);
    }
}