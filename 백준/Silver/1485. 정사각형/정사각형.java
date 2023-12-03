import jdk.dynalink.beans.StaticClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            HashSet<Double> set = new HashSet<>();
            int[][] arr = new int[4][2];
            for (int i = 0; i < 4; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                arr[i][0] = Integer.parseInt(st.nextToken());
                arr[i][1] = Integer.parseInt(st.nextToken());
            }
            for (int i = 0; i < 3; i++) {
                int x = arr[i][0];
                int y = arr[i][1];
                for(int j=i+1;j<4;j++){
                    double tmp=Math.pow((arr[j][0]-x),2)+Math.pow((arr[j][1]-y),2);
                    set.add(tmp);
                }

            }
           if(set.size()==2){
               System.out.println(1);
           }else System.out.println(0);
        }
    }
}



