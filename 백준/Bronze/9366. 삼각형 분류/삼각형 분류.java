import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.Arrays;
import java.util.StringTokenizer;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            cnt++;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            sb.append("Case #").append(cnt);
            Arrays.sort(arr);
            if (arr[0] + arr[1] <= arr[2]) {
                sb.append(": invalid!").append('\n');
                continue;
            }
            if (arr[0] == arr[1] && arr[0] == arr[2]) {
               sb.append(": equilateral");
            } else if (arr[0] == arr[1]||arr[1]==arr[2]) {
                sb.append(": isosceles");
            } else {
                sb.append(": scalene");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}



