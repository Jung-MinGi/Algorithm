import jdk.dynalink.beans.StaticClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(arr);
            if(arr[0]==arr[1]&&arr[1]==arr[2]){
                System.out.println(2);
            }else if(Math.pow(arr[2],2)==(Math.pow(arr[0],2)+Math.pow(arr[1],2))){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
    }

}



