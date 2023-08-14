import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] arr= new String[4];
        for(int i=0; i<4; i++){
            arr[i]=st.nextToken();
        }
        String num1=arr[0]+arr[1];
        String num2=arr[2]+arr[3];
        System.out.println(Long.parseLong(num1)+Long.parseLong(num2));
    }
}
