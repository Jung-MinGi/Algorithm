import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a=0;
        for(int i=1;i<=n;i++){
            int tmp=i;
            int x=0;
            while(true){
                x+=tmp%10;
                tmp=tmp/10;
                if(tmp==0)break;
            }
            if(i%x==0)a++;
        }
        System.out.println(a);
    }
}

