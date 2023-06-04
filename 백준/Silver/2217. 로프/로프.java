import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        for(int i=0; i<t; i++){
            arr[i]= Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int max=Integer.MIN_VALUE;
        int val = t;
        for(int i=1; i<=t; i++){
            val-=1;
            max = Math.max(arr[val] * i, max);
        }
        System.out.println(max);
    }
}