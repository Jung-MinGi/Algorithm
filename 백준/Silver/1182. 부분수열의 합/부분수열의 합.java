import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static int[] input;
    public static boolean[] visit;
    static int n;
    static int s;
    static int answer;

    static int depth = 0;
    static int m = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        arr = new int[n];
        visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            dfs(0,0);
            m++;
        }

        System.out.println(answer);
    }

    static void dfs(int at,int depth) {
        if (depth == m) {
            int sum = 0;
            for (int i : arr) {
                if(i==0) continue;
                sum += i;
            }

            if (sum == s) {
                answer++;
            }
            return;
        }

        for (int i = at; i < input.length; i++) {
            if (!visit[i]) {
                arr[depth] = input[i];
                visit[depth] = true;
                dfs(i+1,depth + 1);
                visit[depth] = false;
            }
        }
    }
}