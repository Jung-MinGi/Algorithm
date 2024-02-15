import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[2*n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 2*n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min=200000;
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            min=Math.min(min,arr[low]+arr[high]);
            low++;
            high--;
        }
        System.out.println(min);
    }
}