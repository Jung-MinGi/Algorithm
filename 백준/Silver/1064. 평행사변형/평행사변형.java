import jdk.dynalink.beans.StaticClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        double AB = Math.sqrt(Math.pow((arr[2] - arr[0]), 2) + Math.pow((arr[3] - arr[1]), 2));
        double AC = Math.sqrt(Math.pow((arr[4] - arr[0]), 2) + Math.pow((arr[5] - arr[1]), 2));
        double BC = Math.sqrt(Math.pow((arr[4] - arr[2]), 2) + Math.pow((arr[5] - arr[3]), 2));
        if (((arr[2] - arr[0])*(arr[5] - arr[1])) == ((arr[3] - arr[1]) * (arr[4] - arr[0]))) {
            System.out.println(-1);
            return;
        }


        double max = Math.max(AB * 2 + AC * 2, AB * 2 + BC * 2);
        double min = Math.min(AB * 2 + AC * 2, AB * 2 + BC * 2);
        //AB
        max = Math.max(AC * 2 + BC * 2, max);
        min = Math.min(AC * 2 + BC * 2, min);
        System.out.print(max - min);
    }
}



