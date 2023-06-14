import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      long n = Long.parseLong(br.readLine());
      int value=0;
      long sum=0;
      while(sum < n){
          value++;
          sum+=value;

          if(sum > n){
             value = value-1;
              break;
          }
      }
        System.out.println(value);
    }
}