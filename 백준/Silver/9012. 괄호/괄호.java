import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      StringBuilder sb = new StringBuilder();
      for(int i=0; i<n; i++){
          String str = br.readLine();
          while(str.contains("()")){
              str = str.replace("()","");
          }
          if(str.length()==0){
              sb.append("YES").append('\n');
          }else{
              sb.append("NO").append('\n');
          }
      }
        System.out.println(sb);


    }

}