import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();
        int[] arr = new int[charArray.length];
        int sum = 1;
        int zeroNum = 0;
        for (int i = 0; i < charArray.length; i++) {
            arr[i] = charArray[i] - '0';
            if (arr[i] == 0) {
                zeroNum++;
                continue;
            }
            sum *= arr[i];
        }
        int answer = 1;
        if (zeroNum >= 2) {
            System.out.println("YES");

        }else if(zeroNum==1||arr.length==1){
            System.out.println("NO");
        }else{
            for (int i = 0; i < charArray.length; i++) {
                answer *= arr[i];
                sum = sum / arr[i];
                if (sum == answer) {
                    System.out.println("YES");
                    return;
                }

            }
            System.out.println("NO");
        }


    }
}
