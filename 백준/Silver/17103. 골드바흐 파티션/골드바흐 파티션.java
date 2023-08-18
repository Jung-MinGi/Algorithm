import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static boolean[] arr = new boolean[1000001];
    static ArrayList<Integer> primeNums = new ArrayList<>();
    static int l;
    static int r;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        findPrimeNums();
        while (t-- > 0) {
            sb.append(solution(Integer.parseInt(br.readLine()))).append('\n');
        }
        System.out.println(sb);

    }

    static int solution(int n) {
        l = 0;
        r = primeNums.size() - 1;
        int cnt = 0;
        while (l <= r) {
            int i = primeNums.get(l) + primeNums.get(r);
            if (i == n) {
                l++;
                r--;
                cnt++;
            } else if (i > n) {
                r--;
            } else l++;
        }
        return cnt;
    }

    static void findPrimeNums() {
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i <= Math.sqrt(arr.length); i++) {
            if (!arr[i]) {

                for (int j = i * i; j < arr.length; j = j + i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) primeNums.add(i);
        }
    }

}
