import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lcm =Integer.MAX_VALUE;
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<4;i++){
            for(int j=i+1;j<5;j++){
//                lcm = Math.min(lcm,(arr[i]*arr[j])/soultion(arr[i],arr[j]));
                lcm = Math.min(lcm,(soultion(arr[i],arr[j])));
            }
        }
        int idx=1;
        while(true){
            int tmp = lcm*idx;
            int cnt=0;

            for(int i=0;i<5;i++){
                if(tmp%arr[i]==0)cnt++;
            }
            if(cnt>2){
                System.out.println(tmp);
                break;
            }
            idx++;
        }
        }
        static int soultion(int a,int b){
        if(a%b==0)return b;
        else return soultion(b,a%b);
        }
}
