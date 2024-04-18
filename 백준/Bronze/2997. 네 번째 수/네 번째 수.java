import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int gap = Math.min(arr[1]-arr[0],arr[2]-arr[1]);
        int ans=0;
        if(arr[0]+gap!=arr[1]){
            System.out.println(arr[0]+gap);
        }else if(arr[1]+gap!=arr[2]){
            System.out.println(arr[1]+gap);
        }else System.out.println(arr[2]+gap);

    }
}
