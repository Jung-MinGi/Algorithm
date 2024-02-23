import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int n, l, w, h;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        h = Integer.parseInt(st.nextToken());
        binarySearch();
    }

    static void binarySearch() {
        double low = 0;
        double high = Math.min(l, Math.min(w, h));
        double prevMid=0;
        while (true) {
            double mid = (low + high) / (double)2;
            if(Math.abs(low-high)<=0.000000001||prevMid==mid){
                System.out.printf("%.11f",mid);
                break;
            }
            double boxNum = findBoxSize(mid);
            if (boxNum >= n) {
                low = mid;
            } else high = mid;
            prevMid=mid;
        }

    }

    static double findBoxSize(double mid) {
        return Math.floor((l / mid)) * Math.floor((w / mid)) * Math.floor((h / mid));
    }
}
