import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static char[] arr;
    static char[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        while (testCase-- > 0) {
            int n = Integer.parseInt(br.readLine());
            arr = br.readLine().toCharArray();
            answer = br.readLine().toCharArray();
            int count=0;
            int wrongW=0;
            int wrongB=0;
            for(int i=0;i<n;i++){
                if(arr[i]==answer[i])continue;
                if(arr[i]=='W')wrongW++;
                else wrongB++;
            }
            count = Math.min(wrongW,wrongB);
            count+=wrongW < wrongB?wrongB-wrongW:wrongW-wrongB;
            System.out.println(count);

        }
    }
}