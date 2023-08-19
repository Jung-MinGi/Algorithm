import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean[] arr = new boolean[10000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        findPrimeNums();
        //n==1
        if (n == 1) {
            System.out.println();
        }
        //n이 소수인경우
        else if (!arr[n]) {
            System.out.println(n);
        }
        //그 외
        else {
            int idx = 2;
            while (n != 1 && arr[n]) {
                if (n % idx == 0) {
                    while (n != 1 && n % idx == 0) {
                        n = n / idx;
                        sb.append(idx).append('\n');
                    }
                }
                idx++;
            }
            if(n!=1) sb.append(n);
            System.out.println(sb);
        }

    }

    static void findPrimeNums() {
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i <= Math.sqrt(arr.length - 1); i++) {
            if (!arr[i]) {
                for (int j = i * i; j < arr.length; j = j + i) {
                    arr[j] = true;
                }
            }
        }
    }
}
