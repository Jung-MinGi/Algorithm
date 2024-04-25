import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s="";
        while((s=br.readLine())!=null){
            int year=0;
            StringTokenizer st = new StringTokenizer(s);
            
            double n = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken())/100;
            double m = Double.parseDouble(st.nextToken());
            while(n<m){
                n=n+n*b;
                year++;
            }
            System.out.println(year);
        }


    }
}
