import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] arr = new int[32];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int idx = 31;
        while (n != 0) {
            int tmp = (int) Math.pow(2, idx);
            if (n >= tmp) {
                arr[idx] = 1;
                n = n - tmp;
            }
            idx--;

        }
        int[] another = new int[32];
        for (int i = 0; i < arr.length; i++) {
            another[i]=(arr[i]==0)?1:0;
        }
        for (int i = 0; i < arr.length; i++) {
            int a = another[i];
            if (a == 1) another[i] = 0;
            else {
                another[i] = 1;
                break;
            }
        }
        int count=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=another[i])count++;
       }
        System.out.println(count);
    }
}


