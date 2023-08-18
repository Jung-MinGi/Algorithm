import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(br.readLine());
        arr = new int[x];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int tenNum = convterToTen(arr.length - 1, a, arr);
        System.out.println(solution(tenNum,b));
    }
    static String solution(int n,int b){
        StringBuilder sb = new StringBuilder();
        Deque<Integer> d = new ArrayDeque<>();
        int a=n;
        int x;
        while(n>=b){
             a = n/b;
             x = n%b;
            d.addFirst(x);
            n=a;
        }
        d.addFirst(a);
        d.stream().forEach(i->sb.append(i).append(' '));
        return sb.toString();
    }

    static int convterToTen(int len, int n, int[] arr) {
        int sum = 0;
        for (int i = len; i >= 0; i--) {
            int x = arr[i];
            sum = sum + (x * (int) Math.pow(n, len - i));
        }
        return sum;
    }

}
