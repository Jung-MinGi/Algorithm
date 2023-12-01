import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int circleX1 = x;
        int circleY1 = (h/2)+y;
        int circleX2 = x+w;
        int circleY2 = circleY1;
        int r=h/2;
        int cnt=0;
        while (p-- > 0) {
            st = new StringTokenizer(br.readLine());
           int a = Integer.parseInt(st.nextToken());
           int b = Integer.parseInt(st.nextToken());
            //직사각형 안에 있는지
            if(a>=x&&a<=x+w&&b>=y&&b<=y+h){
                cnt++;
                continue;
            }
            if(Math.pow(r,2)>=(Math.pow((circleX1-a),2)+Math.pow((circleY1-b),2))){
                cnt++;
                continue;
            }
            if(Math.pow(r,2)>=(Math.pow((circleX2-a),2)+Math.pow((circleY2-b),2))){
                cnt++;
            }
        }
        System.out.println(cnt);}
}



