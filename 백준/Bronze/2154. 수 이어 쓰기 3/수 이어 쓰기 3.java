import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();
        int n =Integer.parseInt(br.readLine());
        int i=1;
        while(i<=100000){
            sb.append(i++);

        }
        System.out.println(sb.indexOf(n+"")+1);
    }
}


