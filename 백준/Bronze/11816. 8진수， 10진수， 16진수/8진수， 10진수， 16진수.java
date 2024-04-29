import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.charAt(0)!='0') System.out.println(s);
        else if(s.charAt(1)=='x'){
            int sum=0;
            StringBuilder sb = new StringBuilder(s).reverse();
            for(int i=0;i<s.length();i++){
                if(sb.charAt(i)=='x')break;
                if(Character.isAlphabetic(sb.charAt(i))){
                    sum+=(int)Math.pow(16,i)*((sb.charAt(i)-'a')+10);
                    continue;
                }
                sum+=(int)Math.pow(16,i)*(sb.charAt(i)-'0');
            }
            System.out.println(sum);
        }else{
            int sum=0;
            StringBuilder sb = new StringBuilder(s).reverse();
            for(int i=0;i<s.length()-1;i++){
                sum+=(int)Math.pow(8,i)*(sb.charAt(i)-'0');
            }
            System.out.println(sum);
        }
    }
}

