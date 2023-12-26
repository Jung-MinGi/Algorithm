import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int cnt=0;
        for(int i=1;i<a/3;i++){
            for(int j=1;j<a/3;j++){
                int tmp = i*3+j*3;
                if(a-tmp>0)cnt++;
            }
        }
        System.out.println(cnt);
    }
}
