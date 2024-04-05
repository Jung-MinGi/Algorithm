import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        int max = 2*n-1;
        for (int i = 2 * n - 1; i >= 1; i -= 2) {
           for(int j=0;j<(max-i)/2;j++)sb.append(' ');
           for(int j=0;j<i;j++)sb.append('*');
           sb.append('\n');
        }
        for(int i=3;i<=2*n-1;i+=2){
            for(int j=0;j<(max-i)/2;j++)sb.append(' ');
            for(int j=0;j<i;j++)sb.append('*');
            sb.append('\n');
        }
        System.out.println(sb);
    }
}

