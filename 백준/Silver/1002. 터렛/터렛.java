import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    static int n;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

         sb.append(findLen(x1,y1,r1,x2,y2,r2)).append('\n');

        }
        System.out.print(sb);
    }
    static int findLen(int x1,int y1,int r1,int x2,int y2,int r2){
        int tmp =(int) (Math.pow(Math.abs(x1-x2),2) + Math.pow(Math.abs(y1-y2),2));
        if(tmp ==0 && r1==r2) return -1;
        if(tmp > Math.pow(r1+r2,2)) return 0;
        if(tmp < Math.pow(Math.abs(r1-r2),2)) return 0;
        if(tmp == Math.pow(Math.abs(r1-r2),2)) return 1;
        if(tmp == Math.pow(Math.abs(r1+r2),2)) return 1;
        return 2;
    }
}


