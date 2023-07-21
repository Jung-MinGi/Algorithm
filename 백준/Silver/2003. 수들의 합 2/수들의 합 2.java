import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int start = 0;
        int end = 0;
        int cnt=0;
        int sum = 0;
        while (end <= n) {
            if(sum >= m){
               sum-=arr[start++];
            }else{//m값이 더 큰경우
                if(end == n )break;
                sum+=arr[end++];
            }
            if(sum==m)cnt++;
        }
        System.out.println(cnt);


    }

}


