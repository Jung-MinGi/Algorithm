import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static long[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new long[n+1];
        for(int i=0; i<arr.length; i++){
            arr[i]=-1;
        }
        arr[0]=0;
        if(n>0){
            arr[1]=1;
            System.out.println(recur(n));
        }else{
            System.out.println(arr[0]);
        }

    }
    static long recur(int n){
        if(arr[n]==-1){
            arr[n]= recur(n-1)+recur(n-2);
        }return arr[n];
    }
}