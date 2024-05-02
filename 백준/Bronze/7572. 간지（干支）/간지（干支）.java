import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n =Integer.parseInt(br.readLine());
       String x="6789012345", y="IJKLABCDEFGH";
        System.out.println(y.charAt(n%12)+""+x.charAt(n%10));
        }

    
}

