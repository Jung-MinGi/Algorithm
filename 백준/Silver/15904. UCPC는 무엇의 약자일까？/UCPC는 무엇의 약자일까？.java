import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] tar = {'U','C','P','C'};
        int nextChar=0;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c == tar[nextChar]) {
                sb.append(c);
                nextChar++;
                if(nextChar == tar.length){
                    break;
                }
            }
        }

        if(sb.toString().contains("UCPC")) {
            System.out.println("I love UCPC");
        }else{
            System.out.println("I hate UCPC");
        }

    }
}