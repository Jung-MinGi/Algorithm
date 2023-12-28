import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int tmp = (n / 100)*100;
        for (int i = 0; i < 100; i++) {
            if((tmp+i)%m==0){
                if(i<10){
                    System.out.println("0"+i);
                }else{
                    System.out.println(i);
                }
                return;
            }
        }


    }


}
