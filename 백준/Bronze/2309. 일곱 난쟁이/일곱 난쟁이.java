import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int length=0;
        for(int i=0; i<9; i++){
            arr[i]=Integer.parseInt(br.readLine());
            length += arr[i];
        }
        Arrays.sort(arr);
        int out=0;
        for(int i=0; i<8; i++){
            for(int j=i+1; j<9; j++){
                if(length-arr[i]-arr[j] == 100){
                    arr[i]=0;
                    arr[j]=0;
                    out=1;
                    break;
                }
            }
            if(out == 1){
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            if(i != 0){
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}