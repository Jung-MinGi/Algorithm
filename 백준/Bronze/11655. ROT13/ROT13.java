import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int a = s.charAt(i);
            //대문자
            if(a>=65 && a<=90){
                if(a+13<=90){
                    sb.append((char) (a+13));
                }else{
                    int x = a + 13 - 90;
                    sb.append((char) (64+x));
                }
                continue;
            }
            //소문자
            else if(a>=97 && a<=122){
                if(a+13<=122){
                    sb.append((char) (a+13));
                }else{
                    int x = a + 13 - 122;
                    sb.append((char) (96+x));
                }
                continue;
            }
            //나머지
            sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}
