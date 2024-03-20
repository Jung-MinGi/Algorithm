import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    /**
     * N운동횟수
     * m초기맥박
     * M최대맥박
     * T운동할때 맥박
     * R휴식
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int idx = 0;
        int time=0;
        int currentPaluse=m;
        while (idx < n) {
            if(time>=30051){
                System.out.println(-1);
                return;
            }
            if(currentPaluse+t<=M){
                while(idx<n&&currentPaluse+t<=M){
                    time++;
                    idx++;
                    currentPaluse+=t;
                }
            }else{
                currentPaluse-=r;
                time++;
                if(currentPaluse<m)currentPaluse=m;
            }
        }
        System.out.println(time);
    }
}
