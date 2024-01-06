import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr = new int[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr[0]=1;
        for (int i = 1; i < arr.length; i++) {
            String s = String.valueOf(i);
            int cnt=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='0')cnt++;
            }
            arr[i]=arr[i-1]+cnt;
        }
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0){
                System.out.println(arr[b]);
            }
            else{
                System.out.println(arr[b]-arr[a-1]);
            }
        }
    }
}
