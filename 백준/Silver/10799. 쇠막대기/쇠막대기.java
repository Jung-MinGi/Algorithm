import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer=0;
        int stick=1;
        String s = br.readLine();
        Character pre='(';
        for(int i=1; i<s.length(); i++){
            char c = s.charAt(i);
            //입력값이 )
            if(pre == '(' && c == ')'){
                stick--;
                answer+=stick;
            }
            if(pre == ')' && c == ')'){
                stick--;
                answer+=1;
            }
            //입력값이 (
            if(c == '('){
                stick++;
            }
            pre=c;
        }
        System.out.println(answer);
    }

}
