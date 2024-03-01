import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final int chickenNumber = 4;
    private static final int starcraftNumber = 2;
    static boolean[] arr = new boolean[2701];
    static boolean[] isPerfect = new boolean[2701];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr[0] = true;
        arr[1] = false;
        for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if (arr[i]) continue;
            for (int j = i * i; j < arr.length; j += i) arr[j] = true;
        }
        isPerfect(4);
        int i = Integer.parseInt(br.readLine());
        boolean b = isPerfect[i] && getSum(i);//이면수
        boolean x = i == chickenNumber || i == starcraftNumber || (arr[i] && findPrimeNum(i));//임현수
        if (b && x) {
            System.out.println(4);
        } else if (b) {
            System.out.println(1);
        } else if (x) {
            System.out.println(2);
        } else System.out.println(3);


    }

    static void isPerfect(int n) {
        if (n > 2700) return;
        isPerfect[n] = true;
        int[] aa = new int[]{2, 3, 4};
        for (int i = 0; i < 3; i++) {
            int tmp = n + aa[i];
            if (tmp > 2700) return;
            if (!isPerfect[tmp]) {
                isPerfect[tmp] = true;
                isPerfect(tmp);
            }
        }
    }

    //각 자리수 합 구하기
    static boolean getSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum % 2 == 1;
    }

    static boolean findPrimeNum(int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (arr[i]) continue;
            while (n % i == 0) {
                n = n / i;
                set.add(i);
            }
        }
        if(n!=1)set.add(n);
        return set.size() % 2 == 0;
    }

}


