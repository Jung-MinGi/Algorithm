import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            boolean flag=false;
            int i = Integer.parseInt(br.readLine());
            if(i==0)break;
            while(i>=10){
//                if(!flag){
//                    flag=true;
//                    System.out.print(i+" ");
//                }
                System.out.print(i+" ");
                int tmp=1;
                String s = String.valueOf(i);
                for(int j=0;j<s.length();j++)tmp*=s.charAt(j)-'0';
                i=tmp;
            }
            System.out.println(i);
//            System.out.println(i);
        }
    }
}
