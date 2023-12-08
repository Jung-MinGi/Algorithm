import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null){
            int a=1;
            int cnt=1;
            int n = Integer.parseInt(s);
            while(a%n!=0){
                a=((a*10)+1)%n;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}


