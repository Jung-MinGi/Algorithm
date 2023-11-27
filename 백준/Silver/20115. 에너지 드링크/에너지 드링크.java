import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

                arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        double sum = arr[n-1];
        for (int i = 0; i < n-1; i++) {
            sum+=(double)arr[i]/2;
        }
        System.out.println(sum);
    }
}


