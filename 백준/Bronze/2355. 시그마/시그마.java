import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
//        if(a.compareTo(new BigInteger("0"))<0)a=a.multiply(new BigInteger("-1"));
//        if(b.compareTo(new BigInteger("0"))<0)b=b.multiply(new BigInteger("-1"));

        BigInteger x = a.multiply(a.add(new BigInteger(a.compareTo(new BigInteger("0"))+""))).divide(new BigInteger("2"));
        BigInteger y = b.multiply(b.add(new BigInteger(b.compareTo(new BigInteger("0"))+""))).divide(new BigInteger("2"));
//        if(a.compareTo(new BigInteger("0"))<0)x=x.multiply(new BigInteger("-1"));
//        if(b.compareTo(new BigInteger("0"))<0)y=y.multiply(new BigInteger("-1"));
       //둘다 음수인경우
        if(a.compareTo(new BigInteger("0"))<0&&b.compareTo(new BigInteger("0"))<0){
            if(a.compareTo(b)<0){
                System.out.println(y.subtract(x).add(b));
            }else if(a.compareTo(b)>0){
                System.out.println(x.subtract(y).add(a));
            }else{
                System.out.println(a);
            }
        }else if(a.compareTo(new BigInteger("0"))>0&&b.compareTo(new BigInteger("0"))>0){
            if(a.compareTo(b)<0){
                System.out.println(y.subtract(x).add(a));
            }else if(a.compareTo(b)>0){
                System.out.println(x.subtract(y).add(b));
            }else{
                System.out.println(a);
            }
        }else if(a.compareTo(new BigInteger("0"))==0||b.compareTo(new BigInteger("0"))==0){
            if(a.compareTo(b)<0){
                System.out.println(y.subtract(x));
            }else if(a.compareTo(b)>0){
                System.out.println(x.subtract(y));
            }else{
                System.out.println(a);
            }
        }else{
            if(a.compareTo(b)<0){
                System.out.println(y.subtract(x));
            }else if(a.compareTo(b)>0){
                System.out.println(x.subtract(y));
            }else{
                System.out.println(a);
            }
        }


    }
}

