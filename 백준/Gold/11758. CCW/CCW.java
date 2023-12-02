import jdk.dynalink.beans.StaticClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[3][2];
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int x1 = arr[0][0];
        int y1 = arr[0][1];
        int x2 = arr[1][0];
        int y2 = arr[1][1];
        int x3 = arr[2][0];
        int y3 = arr[2][1];
        System.out.println(ccw(x1,y1,x2,y2,x3,y3));
    }
    static int ccw(int x1,int y1,int x2,int y2,int x3,int y3){
        int tmp = (x1*y2+x2*y3+x3*y1)-(x2*y1+x3*y2+x1*y3);
        if(tmp>0)return 1;
        else if(tmp < 0 )return -1;
        return 0;
    }
}



