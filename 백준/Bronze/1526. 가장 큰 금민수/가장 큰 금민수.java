import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=n;i>=4;i--){
            char[] charArray = String.valueOf(i).toCharArray();
            boolean flag=true;
            for(int j=0;j< charArray.length;j++){
                if(charArray[j]=='7'||charArray[j]=='4')continue;
                else{
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                return;
            }
        }
    }
}
