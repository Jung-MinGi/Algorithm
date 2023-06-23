import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Queue<Character> q = new LinkedList<>();

        StringBuilder sb = new StringBuilder();
        //소문자,공백 제거
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'U' || c == 'P' || c == 'C') {
            q.offer(c);
            }
        }
        char[] tar = {'U','C','P','C'};
        int nextChar=0;
        while(!q.isEmpty()){
            Character poll = q.poll();
            if(poll == tar[nextChar]){
                sb.append(poll);
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