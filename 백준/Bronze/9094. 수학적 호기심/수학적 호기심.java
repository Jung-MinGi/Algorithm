import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(a-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int cnt=0;
            for(int i=1;i<n;i++){
                for(int j=i+1; j<n;j++){
                    double child = i*i+j*j+m;
                    int parent = i*j;
                    double tmp = child/(double)parent;
                    if(tmp%1==0.0){
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append('\n');
        }
        System.out.println(sb);
    }
}

