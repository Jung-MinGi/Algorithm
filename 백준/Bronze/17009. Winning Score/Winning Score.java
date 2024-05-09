import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int a=0;
      int b=0;
      for(int i=3;i>0;i--){
          a+=Integer.parseInt(br.readLine())*i;
      }

        for(int i=3;i>0;i--){
            b+=Integer.parseInt(br.readLine())*i;
        }
        if(a==b) System.out.println("T");
        else if(a>b) System.out.println("A");
        else System.out.println("B");
    }

}
