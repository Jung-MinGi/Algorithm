import jdk.dynalink.beans.StaticClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while (n-- > 0) {
            cnt++;
            int[] arr = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            sb.append("Scenario #").append(cnt).append(":").append('\n');
            if (Math.pow(arr[2], 2) == (Math.pow(arr[0], 2) + Math.pow(arr[1], 2))) {
                sb.append("yes").append('\n');
            } else {
                sb.append("no").append('\n');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

}



