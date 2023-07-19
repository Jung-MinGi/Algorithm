import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        //x==0으로 가는 거리
        int x1= x;
        //x반대로가는 거리
        int x2 = w-x;
        int minX = Math.min(x1, x2);
        //y==0
        int  y1 = y;
        
        //y반대

        int y2 = h-y;
        int minY = Math.min(y1,y2);
        System.out.println(Math.min(minY,minX));

    }
}
