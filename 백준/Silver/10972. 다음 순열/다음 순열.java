import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
       if(nextPermutation(arr)){
           StringBuilder sb = new StringBuilder();
           for (int i : arr) {
               sb.append(i).append(' ');
           }
           System.out.println(sb);
       }else{
           System.out.println(-1);
       }
    }

    static boolean nextPermutation(int[] a) {
        int i = a.length - 1;
        while (i > 0 && a[i - 1] >= a[i]) i--;
        if (i <= 0) return false;

        int j = a.length - 1;

        while (a[i - 1] >= a[j]) {
            j--;
        }
        int tmp = a[j];
        a[j] = a[i - 1];
        a[i - 1] = tmp;
        j=a.length-1;
        while (i<j) {
            tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
        return true;
    }
}
