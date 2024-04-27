import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=N;i++){
            int a = Integer.parseInt(br.readLine());
            String[] arr = new String[a];
            for(int j=0;j<a;j++)arr[j]=br.readLine();
            int x = Integer.parseInt(br.readLine());
            sb.append("Scenario ").append("#").append(i).append(":").append('\n');
            while(x-->0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                while(st.hasMoreTokens())sb.append(arr[Integer.parseInt(st.nextToken())]);
                sb.append('\n');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
