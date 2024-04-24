import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[][] a = {{"A","B","C"},{"D","E","F"},{"G","H","I"},{"J","K","L"},{"M","N","O"},{"P","Q","R","S"},{"T","U","V"},{"W","X","Y","Z"}};
        int n =Integer.parseInt(br.readLine());
       while(n-->0){
           String s = br.readLine().toUpperCase();
           StringBuilder sb = new StringBuilder();
           for(int i=0;i<s.length();i++){
               char c = s.charAt(i);
              for(int j=0;j<a.length;j++) {
                   boolean flag=false;
                   for (String string : a[j]) {
                       if(c==string.charAt(0)){
                           flag=true;
                           sb.append(j+2);
                           break;
                       }
                   }
               }
           }
           String tmp = sb.toString();
           String string = sb.reverse().toString();
           if(tmp.equals(string)){
            System.out.println("YES");
        }else System.out.println("NO");
       }
    }
}
