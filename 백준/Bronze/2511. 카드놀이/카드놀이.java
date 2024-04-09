import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] arr = new int[10];
    static int[] brr = new int[10];
    static char[] result = new char[10];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 10; i++) {
            brr[i] = Integer.parseInt(st.nextToken());
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] < brr[i]) {
                b += 3;
                result[i] = 'B';
            } else if (arr[i] > brr[i]) {
                a += 3;
                result[i] = 'A';
            } else {
                a += 1;
                b += 1;
                result[i] = 'D';
            }
        }
        if(a>b){
            System.out.println(a + " " + b);
            System.out.println('A');
        }else if(a<b){
            System.out.println(a + " " + b);
            System.out.println('B');
        }else{
            System.out.println(a + " " + b);
            for (int i = 9; i >= 0; i--) {
                if (result[i] != 'D') {
                    System.out.println(result[i]);
                    return;
                }
            }
            System.out.println('D');
        }


    }
}
