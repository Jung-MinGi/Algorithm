import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            int a = Integer.parseInt(st.nextToken());
            if(arr[a]!=null){
                for(int j=n-1;j>=a;j--){
                    if(j==0)continue;
                    arr[j]=arr[j-1];
                }
            }
            arr[a]=i;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = n-1; i >=0; i--) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb);
    }

}

