import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String s = br.readLine();
            StringBuilder sb = new StringBuilder(s).reverse();
            int x= Integer.parseInt(s) + Integer.parseInt(sb.toString());
            String a = String.valueOf(x);
            boolean flag=false;
            for(int i=0;i<a.length()/2;i++){
                if(a.charAt(i)!=a.charAt(a.length()-i-1)){
                    System.out.println("NO");
                    flag=true;
                    break;
                }
            }
            if(!flag) System.out.println("YES");
        }

    }
}
