import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String s = br.readLine();
        int cnt=0;
        while(true){
            String tmp = word;
            word = word.replaceFirst(s,".");
            if(word.equals(tmp))break;
            cnt++;

        }
        System.out.println(cnt);
    }
}
