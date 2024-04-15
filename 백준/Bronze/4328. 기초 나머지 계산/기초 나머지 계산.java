import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            if (a == 0) break;
            String b = new StringBuilder(st.nextToken()).reverse().toString();
            String c = new StringBuilder(st.nextToken()).reverse().toString();
            BigDecimal x = soultion(a, b);
            BigDecimal y = soultion(a, c);
            BigDecimal remain = x.divideAndRemainder(y)[1];
            System.out.println(getNum(new BigDecimal(a),remain));

        }
    }
    static String getNum(BigDecimal a,BigDecimal x){
        StringBuilder sb = new StringBuilder();
        while(x.compareTo(a)>=0){
            BigDecimal[] bigDecimals = x.divideAndRemainder(a);
            sb.append(bigDecimals[1]);
            x=bigDecimals[0];
        }
        if(x.compareTo(new BigDecimal(0))!=0)sb.append(x);
        if(sb.length()==0)return "0";
       return sb.reverse().toString();
    }

    static BigDecimal soultion(int a, String s) {
        BigDecimal sum = new BigDecimal("0");
        for(int i=0;i<s.length();i++){
            BigDecimal pow = new BigDecimal(String.valueOf(a)).pow(i);
            sum=sum.add(pow.multiply(new BigDecimal(s.charAt(i)+"")));
        }
        return sum;
    }
}
