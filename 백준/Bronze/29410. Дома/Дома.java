import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int zeroCost = Integer.parseInt(st.nextToken());
        int oneCost = Integer.parseInt(st.nextToken());
        int cost=0;
        while(n-->0){
            st = new StringTokenizer(br.readLine());
            int homeNum = Integer.parseInt(st.nextToken());
            while(st.hasMoreTokens()){
                int i = Integer.parseInt(st.nextToken());
                int oneCount = 0;
                int zeroCount =0;
                String s = Integer.toBinaryString(i);
               for(int a=0;a<s.length();a++){
                   if(s.charAt(a)-'0'==0)zeroCount++;
                   else oneCount++;
               }
                cost+= oneCount * oneCost + zeroCount * zeroCost;
            }
        }
        System.out.println(cost);
    }
}


