import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
static int[] left;
static int[] arr;
static int[] right;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[n];
        left = new int[n];
        right = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        left[0]=0;
        int leftMax=0;
        int rightMax=0;
        for(int i=1;i<n;i++){
          if(arr[i-1]<=arr[i])left[i]=left[i-1]+1;
          else left[i]=0;
          leftMax = Math.max(left[i],leftMax);
        }
        for(int i=n-2;i>=0;i--){
          if(arr[i+1]<=arr[i])right[i]=right[i+1]+1;
          else right[i]=0;
          rightMax = Math.max(rightMax,right[i]);
        }
        System.out.println(Math.max(rightMax,leftMax)+1);
        
    }
}


