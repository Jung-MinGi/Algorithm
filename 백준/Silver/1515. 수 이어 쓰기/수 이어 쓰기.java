import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[] visit;
    static String s;

    /**
     * 1515번
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = br.readLine();
        visit = new boolean[s.length()];
        int idx=1;
        for(int i=0;i<s.length();i++){
            if(visit[i])continue;
            while(check(String.valueOf(idx),i)==0)idx++;
            idx++;

        }
        System.out.println(idx-1);

    }

    /**
     * @param a 100
     * @param b 000
     */
    static int check(String a, int b) {
        int count=0;
        String substring = s.substring(b, (Math.min(a.length() + b, s.length())));
        int init=0;
        for (int i = 0; i < substring.length(); i++) {
            boolean flag = true;
           for(int j=init;j<a.length();j++){
               if(a.charAt(j)==substring.charAt(i)){
                   init=j+1;
                   flag=false;
                   visit[b+i]=true;
                   count++;
                   break;
               }
           }
           if(flag)return count;
        }
return count;
    }
}
