import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[101];
        arr[1]=2;
        arr[2]=4;
        int idx=4;
        for(int i=3;i<101;i+=2){
            arr[i]=arr[i-2]+idx;
            idx+=2;
        }
        idx=5;
        for(int i=4;i<101;i+=2){
            arr[i]=arr[i-2]+idx;
            idx+=2;
        }
        System.out.println(arr[Integer.parseInt(br.readLine())]);
    }
}
/**
 * 1번 2개
 * 2번 4개
 * 3번 6개
 * 4번 9개
 * 5번 12개
 * 6번 16개
 * 7번 20개
 * 8번 25
 */