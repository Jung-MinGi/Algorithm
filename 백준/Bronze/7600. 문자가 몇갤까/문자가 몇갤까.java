import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       while (true){
           HashSet<Character> set = new HashSet<>();
           String s = br.readLine().toLowerCase();
            if(s.equals("#"))break;
           for (int i = 0; i < s.length(); i++) {
               if(Character.isAlphabetic(s.charAt(i)))set.add(s.charAt(i));
           }
           System.out.println(set.size());
       }

    }
}

