import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    /**
     * 1972백준
     * @param args
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=null;
        StringBuilder sb = new StringBuilder();
        while(!(str=br.readLine()).equals("*")){
            boolean flag=false;
            for(int i=1;i<str.length();i++){
                if(!isSurprising(str,i)){
                    flag=true;
                    break;
                }
            }
            if(flag){
                sb.append(str).append(" is ").append("NOT surprising.");
            }else{
                sb.append(str).append(" is ").append("surprising.");
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }
    static boolean isSurprising(String str,int adj){
        HashSet<String> set = new HashSet<>();
        int count=0;
        for(int i=0;i<str.length()-adj;i++){
            String s = str.charAt(i) + "" + str.charAt(i + adj);
            set.add(s);
            count++;
        }
        return set.size()==count;
    }
}


