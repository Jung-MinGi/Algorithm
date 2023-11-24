import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
    static long c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());
        System.out.println(divideConquer(a, b));
    }

    static long divideConquer(long x, long y) {
        if (y == 1) return x % c;

        long i = divideConquer(x, y / 2);
        if (y % 2 == 0) {
            return i * i % c;
        } else {
            return (i * i % c) * x % c;
        }
    }
}


