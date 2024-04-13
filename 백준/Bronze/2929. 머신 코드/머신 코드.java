import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int ans = 0;

        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isUpperCase(c)&&ans%4==0){
               list.add(c);
               ans++;
            }else if(Character.isUpperCase(c)){
                while(ans%4!=0){
                    list.add('*');
                    ans++;
                }
                list.add(c);
                ans++;
            }
            else{
                list.add(c);
                ans++;
            }
        }
        int tmp=0;
        for (Character c : list) {
            if(c=='*')tmp++;
        }
        System.out.println(tmp);    }
}
