import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int initNum=65;
        int answer=0;
        for(int i=0; i<n.length(); i++){
            int a = Math.abs(initNum - n.charAt(i));
            int b = Math.abs(26-a);
            initNum = n.charAt(i);
            answer+=Math.min(a,b);
        }
        System.out.println(answer);
    }
}