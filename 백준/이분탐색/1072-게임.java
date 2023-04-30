import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long x = Long.parseLong(st.nextToken());
        Long win = Long.parseLong(st.nextToken());
        int winRate = (int) ((win*100)/x);
        if(winRate>=99){
            System.out.println(-1);
        }else{
            int low=0;
            int high=Integer.MAX_VALUE;
            while(low <= high){
                int mid = (low+high)/2;
                int newWinRate = (int) (((win+mid)*100)/(x+mid));
                if(newWinRate>winRate){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            System.out.println(low);
        }
    }
}