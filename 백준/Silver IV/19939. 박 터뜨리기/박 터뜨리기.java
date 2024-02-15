import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int k =Integer.parseInt(st.nextToken());
        int[] arr = new int[k];
        int init = (k * (k + 1)) / 2;
        if(n<init) System.out.println(-1);
        else{
            int tmp = k;
            for(int i=0;i<k;i++){
                arr[i]=tmp;
                tmp--;
            }
            int idx=0;
            while(n-init!=0){
                arr[idx]++;
                n--;
                idx++;
                if(idx==k){
                    idx=0;
                }
            }
            System.out.println(arr[0]-arr[k-1]);
        }
    }
}
