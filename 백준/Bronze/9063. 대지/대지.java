import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bigX = -100001;
        int smallX = 100001;
        int bigY = -100001;
        int smallY = 100001;
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        if (n != 0) {
            while(n-->0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                bigX = Math.max(x,bigX);
                smallX = Math.min(x,smallX);
                bigY = Math.max(y,bigY);
                smallY = Math.min(y,smallY);
            }
            answer = (bigX-smallX)*(bigY-smallY);
        }
        System.out.println(answer);
    }
}


