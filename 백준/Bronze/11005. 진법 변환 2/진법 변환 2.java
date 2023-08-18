import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    static int[] arr = new int[37];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        for (int i = 10; i < arr.length; i++) {
            arr[i] = i + 55;
        }

        System.out.println(solution(n, b));
    }

    static String solution(int n, int y) {
        Deque<Object> d = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int a = n;
        int b;
        while (n!=0) {
            a = n / y;
            b = n % y;
           if(arr[b]!=0) d.addFirst((char)arr[b]);
           else d.addFirst(b);
            n = a;
        }
        d.stream().forEach(i -> sb.append(i));
        return sb.toString();
    }
}
