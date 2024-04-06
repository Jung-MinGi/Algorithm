import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc  =Integer.parseInt(br.readLine());
        while(tc-->0){
            String a ="";
            String s="";
            do{
                a+=s;
                s=null;
            }
            while(!(s=br.readLine()).equals(""));
//            int a = 0;
            int cnt=0;
            for (int i = 0; i < a.length(); i++) if (a.charAt(i) == '#') cnt++;
            double v = ((a.length() - (double) cnt)/a.length()) * 100;
            double ans = (Math.ceil(v * 10)) / 10;
            if((ans*10)%10==0){

                System.out.println("Efficiency ratio is "+(int)ans+"%.");
            }else System.out.println("Efficiency ratio is "+ans+"%.");

        }

    }

}

