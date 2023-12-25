import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(combination(10, 2));
        String s = br.readLine();
        int a = 1;
        int num=10;
        int ch=26;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='c'){
                if(ch==26){
                    a*=ch;
                    ch--;
                }else if(ch==25){
                    a*=ch;
                    ch--;
                }else{
                    ch++;
                    a*=ch;
                    ch--;
                }
                num=10;
            }else{
                if(num==10){
                    a*=num;
                    num--;
                }else if(num==9){
                    a*=num;
                    num--;
                }else{
                    num++;
                    a*=num;
                    num--;
                }
                ch=26;
            }
        }
        System.out.println(a);
    }

}
