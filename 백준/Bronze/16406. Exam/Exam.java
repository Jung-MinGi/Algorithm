import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] me = br.readLine().toCharArray();
        char[] friend = br.readLine().toCharArray();
        int tmp = 0;
        for (int i = 0; i < me.length; i++) {
            if (me[i] == friend[i]) {
                tmp++;
            }
        }
        if(n > tmp){
            System.out.println(tmp+me.length-n);
        }else if(tmp==n){
            System.out.println(tmp+me.length-tmp);
        }else{
            System.out.println(n+me.length-tmp);
        }
    }
}