import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] arr = new int[10];
        for (int i = 0; i <= 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());

        }
        sum=arr[0];
        ArrayList<Integer> list = new ArrayList<>();
        int gap = Math.abs(100-sum);
        int answer=sum;
        for (int i = 1; i <= 9; i++) {
            sum+=arr[i];
            if(Math.abs(100-sum)<=gap && answer < sum){
                gap = Math.abs(100-sum);
                answer = sum;
            }
        }
        System.out.println(answer);
    }
}
