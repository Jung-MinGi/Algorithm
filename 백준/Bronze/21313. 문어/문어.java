import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if(n%2==0){
            for(int i=0; i<n/2; i++){
                sb.append("1 2").append(' ');
            }
        }else {
            for(int i=0; i<(n/2); i++){
                sb.append("1 2").append(' ');
            }
            sb.append("3");
        }
        System.out.println(sb);
    }
}