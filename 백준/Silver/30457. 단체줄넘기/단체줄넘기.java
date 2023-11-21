import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static int[] arr = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
        arr[Integer.parseInt(st.nextToken())]++;
        }
        int cnt=0;
        for(int i=1;i<1001;i++){
            if(arr[i]!=0){
                arr[i]--;
                cnt++;
            }
        } for(int i=1000;i>0;i--){
            if(arr[i]!=0){
                arr[i]--;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}


