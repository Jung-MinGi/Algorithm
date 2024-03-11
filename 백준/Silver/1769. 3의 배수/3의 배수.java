import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int count = 0;
        while(n.length()>1){
            int tmp=0;
            for(int i=0;i<n.length();i++){
                tmp+=n.charAt(i)-'0';
            }
            count++;
            n=tmp+"";
        }
        System.out.println(count);
        System.out.println((Integer.parseInt(n)%3==0)?"YES":"NO");
    }

}


