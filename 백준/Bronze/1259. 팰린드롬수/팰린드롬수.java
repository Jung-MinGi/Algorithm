import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = "";
        boolean flag = false;
        while (!(n = br.readLine()).equals("0")) {
            flag=false;
            for (int i = 0; i < n.length(); i++) {
                int l = i;
                int r = n.length() - l - 1;
                if (n.charAt(l) == n.charAt(r)){
                    if(l==r)break;
                    continue;
                }
                System.out.println("no");
                flag = true;
                break;
            }
            if(flag)continue;
            System.out.println("yes");
        }
    }
}


