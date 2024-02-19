import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int box = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1];
        int left = 1;
        int right = box;
        int t = Integer.parseInt(br.readLine());
        int distance = 0;
        while (t-- > 0) {
            int a = Integer.parseInt(br.readLine());
            if (a >= left && a <= right) continue;
            if(a>right){
                int i = a - right;
                distance+=i;
                right+=i;
                left+=i;
            }else{
                int i =left-a;
                distance+=i;
                right-=i;
                left-=i;
            }
        }
        System.out.println(distance);
    }
}