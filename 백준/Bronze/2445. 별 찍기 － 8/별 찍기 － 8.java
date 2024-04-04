import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int idx=2;
        boolean flag=false;
        for (int i = 0; i < n * 2 - 1; i++) {
            for(int j=0;j<idx/2;j++)sb.append('*');
            for(int j=0;j<n*2-idx;j++)sb.append(' ');
            for(int j=0;j<idx/2;j++)sb.append('*');
            sb.append('\n');
            if(!flag){
                idx+=2;
                if(idx==n*2)flag=true;
                continue;
            }
            if(flag){
                idx-=2;
            }

        }
        System.out.println(sb);
    }
}

