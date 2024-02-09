import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken())-1+1;
        int x = Integer.parseInt(st.nextToken())-1+1;
        if(n==1){
            System.out.println(0);
            return;
        }
        if(n==2){
            System.out.println(2);
            return;
        }
        if(x==1&&y==1||x==n&&y==1||x==1&&y==n||x==n&&y==n){
            System.out.println(2);
        }else if((x==1||x==n)||(y==n||y==1)){
            System.out.println(3);
        }else{
            System.out.println(4);
        }

    }
}
