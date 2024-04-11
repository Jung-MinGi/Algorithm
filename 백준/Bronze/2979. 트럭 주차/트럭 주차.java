import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());//1대
        int b = Integer.parseInt(st.nextToken());//2대
        int c = Integer.parseInt(st.nextToken());//3대
        int[] arr = new int[101];
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for (int j = start + 1; j <= end; j++) {
                arr[j]++;
            }
        }
        int time = 0;
        for (int i : arr) {
            switch (i) {
                case 1:
                    time += a;
                    break;
                case 2:
                    time += (b * 2);
                    break;
                case 3:
                    time += (c * 3);
                    break;
            }
        }
        System.out.println(time);
    }

}
